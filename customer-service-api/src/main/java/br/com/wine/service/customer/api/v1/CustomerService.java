package br.com.wine.service.customer.api.v1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CustomerService
 */
public interface CustomerService {

    @GetMapping("/customer") 
    public List<Customer> getCustomers();

    @GetMapping("/customer/{id}") 
    public Customer getCustomer(@PathVariable("id") Long id);
    
}