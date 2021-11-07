package cz.fel.cvut.flightreservation.service.impl;

import cz.fel.cvut.flightreservation.model.CustomerRequestDto;
import cz.fel.cvut.flightreservation.model.CustomerResponseDto;
import cz.fel.cvut.flightreservation.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void createCustomer(CustomerRequestDto customerRequestDto) {

    }

    @Override
    public void deleteCustomer(Long id) {

    }

    @Override
    public CustomerResponseDto updateCustomer(Long customerId, CustomerRequestDto customerRequestDto) {
        return null;
    }

    @Override
    public List<CustomerResponseDto> findAll() {
        return null;
    }

    @Override
    public CustomerResponseDto findById(Long id) {
        return null;
    }
}
