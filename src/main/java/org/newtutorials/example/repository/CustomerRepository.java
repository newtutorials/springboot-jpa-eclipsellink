package org.newtutorials.example.repository;

import org.newtutorials.example.model.Customer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dani on 25/05/2017.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Override
//    @EntityGraph(value = "Customer.orders", type = EntityGraph.EntityGraphType.LOAD)
    Iterable<Customer> findAll();

}
