package com.abdelaziz26.Ecommerce.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer,String> {

    Optional<Customer> findByEmail(String email);
}
