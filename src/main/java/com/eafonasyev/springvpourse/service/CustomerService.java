package com.eafonasyev.springvpourse.service;

import com.eafonasyev.springvpourse.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    public Customer getCustomer(int id);

    public void saveCustomer(Customer customer);

}
