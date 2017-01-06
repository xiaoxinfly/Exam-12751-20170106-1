package com.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.mapper.CustomerMapper;
import com.exam.pojo.Customer;
import com.exam.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
    
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer getCustomerByFirstName(String firstName) {
        return customerMapper.selectByFirstName(firstName);
    }
    
}
