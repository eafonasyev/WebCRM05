package com.eafonasyev.springvpourse.controllers;

import com.eafonasyev.springvpourse.dao.CustomersDao;
import com.eafonasyev.springvpourse.entity.Customer;
import com.eafonasyev.springvpourse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {

        List<Customer> customers = customerService.getCustomers();

        theModel.addAttribute("customers",customers);

        return "customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        Customer customer = new Customer();

        model.addAttribute("customers",customer);
        return "formAdd";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customers") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

}