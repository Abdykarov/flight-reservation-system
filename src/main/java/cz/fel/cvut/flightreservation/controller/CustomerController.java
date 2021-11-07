package cz.fel.cvut.flightreservation.controller;

import cz.fel.cvut.flightreservation.model.CustomerRequestDto;
import cz.fel.cvut.flightreservation.model.CustomerResponseDto;
import cz.fel.cvut.flightreservation.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/customers/")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping()
    public List<CustomerResponseDto> findAll(){
        return customerService.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerResponseDto findById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        customerService.createCustomer(customerRequestDto);
    }


    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerResponseDto updateCustomer(@PathVariable Long id, @RequestBody CustomerRequestDto customerRequestDto){
        return customerService.updateCustomer(id, customerRequestDto);
    }

    @DeleteMapping({"{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }

}
