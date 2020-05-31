package com.eafonasyev.springcourse.service;

import com.eafonasyev.springcourse.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    public Customer getCustomer(int id);

    public void saveCustomer(Customer customer);

    void deleteCustomer(int id);
}
