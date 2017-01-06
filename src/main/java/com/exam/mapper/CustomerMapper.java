package com.exam.mapper;

import com.exam.pojo.Customer;

public interface CustomerMapper {
    Customer selectByFirstName(String firstName);
}
