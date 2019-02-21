
package br.com.wine.service.customer.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wine.service.customer.api.v1.Customer;
import br.com.wine.service.customer.api.v1.CustomerService;

/**
 * CustomerController
 */
@RestController
public class CustomerController implements CustomerService {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(Customer.builder().id(1L).build());
    }

    @Override
    public Customer getCustomer(Long id) {
        return Customer.builder().id(id).build();
    }

}