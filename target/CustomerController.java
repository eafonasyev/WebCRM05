package com.eafonasyev.springcourse.controllers;

import com.eafonasyev.springcourse.entity.Customer;
import com.eafonasyev.springcourse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/index")
    public String showIndex() {

        return "index";
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

    @GetMapping("/showFormForUpdate")
    public String showUpdateCustomer(@RequestParam("customerId") int id, Model model){
        Customer customer = customerService.getCustomer(id);
        model.addAttribute("customers",customer);
        return "formAdd";
    }
    @GetMapping("/delete")
    public String showDeleteCustomer(@RequestParam("customerId") int id, Model model){
        Customer customer = customerService.getCustomer(id);
        model.addAttribute("customers",customer);
        customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }

}