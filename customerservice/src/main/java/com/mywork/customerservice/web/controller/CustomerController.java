package com.mywork.customerservice.web.controller;

import com.mywork.customerservice.services.CustomerService;
import com.mywork.customerservice.web.dto.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {

        this.service = service;
    }
    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId)
    {
        return new ResponseEntity<CustomerDto>(service.getCustomerById(customerId), HttpStatus.OK);
    }
}
