package com.eafonasyev.springvpourse.service;

import com.eafonasyev.springvpourse.dao.CustomersDao;
import com.eafonasyev.springvpourse.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomersDao  customersDao;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customersDao.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customersDao.saveCustomer(customer);
    }
}
