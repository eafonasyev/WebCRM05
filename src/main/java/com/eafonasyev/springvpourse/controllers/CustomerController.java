package com.eafonasyev.springvpourse.controllers;

import com.eafonasyev.springvpourse.dao.CustomersDao;
import com.eafonasyev.springvpourse.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomersDao customersDao;

    @RequestMapping("/list")
    public String listCustomers(Model theModel) {

        List<Customer> customers = customersDao.getCustomers();

        theModel.addAttribute("customers",customers);

        return "customers";
    }

}