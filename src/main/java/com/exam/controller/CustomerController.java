package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.pojo.Customer;
import com.exam.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/login")
    @ResponseBody
    public Customer login(@RequestParam(name = "firstName") String firstName) {
        return customerService.getCustomerByFirstName(firstName);
    }
    
    
}
