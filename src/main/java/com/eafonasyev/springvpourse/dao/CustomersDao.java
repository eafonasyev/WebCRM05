package com.eafonasyev.springvpourse.dao;

import com.eafonasyev.springvpourse.entity.Customer;

import java.util.List;

public interface CustomersDao {
    public List<Customer> getCustomers();
}