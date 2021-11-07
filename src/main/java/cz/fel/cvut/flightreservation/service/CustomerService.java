package cz.fel.cvut.flightreservation.service;

import cz.fel.cvut.flightreservation.model.CustomerRequestDto;
import cz.fel.cvut.flightreservation.model.CustomerResponseDto;

import java.util.List;

/**
 * Registered customer crud service
 */
public interface CustomerService {

    void createCustomer(CustomerRequestDto customerRequestDto);

    void deleteCustomer(Long id);

    CustomerResponseDto updateCustomer(Long customerId, CustomerRequestDto customerRequestDto);

    List<CustomerResponseDto> findAll();

    CustomerResponseDto findById(Long id);
}
