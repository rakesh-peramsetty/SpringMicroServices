package com.mywork.customerservice.services;

import com.mywork.customerservice.web.dto.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
