package cz.fel.cvut.flightreservation.service.impl;

import cz.fel.cvut.flightreservation.domain.CustomerUser;
import cz.fel.cvut.flightreservation.mapper.CustomerMapper;
import cz.fel.cvut.flightreservation.model.CustomerRequestDto;
import cz.fel.cvut.flightreservation.model.CustomerResponseDto;
import cz.fel.cvut.flightreservation.repository.CustomerRepository;
import cz.fel.cvut.flightreservation.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    @Transactional
    public void createCustomer(CustomerRequestDto customerRequestDto) {
        log.info("Creating new customer | Request dto {}", customerRequestDto);

        final CustomerUser customerUser = customerMapper.toEntity(customerRequestDto);
        final CustomerUser save = customerRepository.save(customerUser);

        log.info("Creating new customer | Customer successfully created with id {}", save.getId());
    }

    @Override
    @Transactional
    public void deleteCustomer(Long id) {
        log.info("Deleting existing customer | Id to delete {}", id);

        if (!customerRepository.existsById(id)) { throw new EntityNotFoundException("Customer doesnt exist!");}
        customerRepository.deleteById(id);

        log.info("Deleting customer | Customer successfully deleted with id {}", id);
    }

    @Override
    @Transactional
    public CustomerResponseDto updateCustomer(Long customerId, CustomerRequestDto customerRequestDto) {
        log.info("Updating existing customer | Request dto {}, customer id {}", customerRequestDto, customerId);

        final CustomerUser existingUser = customerRepository.findById(customerId)
                .orElseThrow(() -> new EntityNotFoundException("Customer doesnt exist"));
        final CustomerUser updatedUser = customerMapper.toEntity(customerRequestDto);
        updatedUser.setId(existingUser.getId());
        final CustomerUser save = customerRepository.save(updatedUser);
        final CustomerResponseDto customerResponseDto = customerMapper.toResponse(save);
        log.info("Updating new customer | Customer successfully updated with id {}", customerId);

        return customerResponseDto;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CustomerResponseDto> findAll() {
        log.info("Finding all customers");

        final List<CustomerUser> customerUsers = customerRepository.findAll();
        final List<CustomerResponseDto> customerResponseDtos = customerUsers.stream()
                .map(customerMapper::toResponse)
                .collect(Collectors.toList());
        log.info("Finding all customers | Returning customers list {}", customerResponseDtos);

        return customerResponseDtos;
    }

    @Override
    @Transactional(readOnly = true)
    public CustomerResponseDto findById(Long id) {
        log.info("Finding customer with id {}", id);

        final CustomerUser customerUser = customerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer doesnt exist"));
        final CustomerResponseDto customerResponseDto = customerMapper.toResponse(customerUser);
        log.info("Finding customer with id {} | Returning customer dto {}", id, customerResponseDto);

        return customerResponseDto;
    }
}
