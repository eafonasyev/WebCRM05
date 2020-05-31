package com.eafonasyev.springcourse.restcontrollers;

import com.eafonasyev.springcourse.entity.Customer;
import com.eafonasyev.springcourse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {

        Customer customer = customerService.getCustomer(customerId);
        return customer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer){

        customer.setId(0);

        customerService.saveCustomer(customer);

        return customer;
    }

    @PostMapping("/customers/{customerId}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable int customerId){

        customer.setId(customerId);
        customerService.saveCustomer(customer);
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer customer){

        customerService.saveCustomer(customer);
        return customer;
    }

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomerId(@PathVariable int customerId){

        Customer customer = customerService.getCustomer(customerId);

        if(customer == null){
            return "object is not exist";
        }

        customerService.deleteCustomer(customerId);

        return "customer with id "+customerId+" was deleted";
    }
}
