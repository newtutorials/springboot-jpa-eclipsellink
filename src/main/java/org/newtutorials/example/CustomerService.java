package org.newtutorials.example;

import org.newtutorials.example.model.Customer;
import org.newtutorials.example.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by dani on 25/05/2017.
 */

@Service
public class CustomerService {
    @Inject
    CustomerRepository repository;

    @Transactional
    public Customer save(Customer customer){
        return repository.save(customer);
    }

    @Transactional
    public Iterable<Customer> findAll(){
        final Iterable<Customer> customers = repository.findAll();
        customers.forEach(customer -> {
            System.out.println(customer.getOrders().size());
        });
        return customers;
    }
}
