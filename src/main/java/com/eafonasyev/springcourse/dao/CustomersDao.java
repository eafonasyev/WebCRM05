package com.eafonasyev.springcourse.dao;

import com.eafonasyev.springcourse.entity.Customer;

import java.util.List;

public interface CustomersDao {
    public List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);
}
