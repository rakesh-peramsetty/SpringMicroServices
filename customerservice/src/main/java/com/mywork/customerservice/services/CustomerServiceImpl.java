package com.mywork.customerservice.services;

import com.mywork.customerservice.web.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().ID(id).name("Rakesh").build();
    }
}
