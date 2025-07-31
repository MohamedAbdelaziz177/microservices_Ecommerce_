package com.abdelaziz26.Ecommerce.Customer;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerMapper {

    public CustomerResponse toCustomerResponse(Customer customer){
        return CustomerResponse.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .email(customer.getEmail())
                .city(customer.getAddress().getCity())
                .state(customer.getAddress().getState())
                .build();
    }

    public Customer toCustomer(CustomerRequest request){
        return Customer.builder()
                .id(UUID.randomUUID().toString())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .address(Address.builder()
                        .city(request.getCity())
                        .state(request.getState())
                        .street(request.getStreet())
                        .zip(request.getZip())
                        .build())
                .build();
    }
}
