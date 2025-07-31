package com.abdelaziz26.Ecommerce.Customer;

import com.abdelaziz26.Ecommerce.Exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerResponse createCustomer(CustomerRequest request){
        Customer customer = customerRepository.save(customerMapper.toCustomer(request));
        return customerMapper.toCustomerResponse(customer);
    }

    public CustomerResponse getCustomerById(UUID id){
        Customer customer = customerRepository.findById(id.toString()).orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
        return customerMapper.toCustomerResponse(customer);
    }

    public CustomerResponse getCustomerByEmail(String email){
        Customer customer = customerRepository.findByEmail(email).orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
        return customerMapper.toCustomerResponse(customer);
    }

    public CustomerResponse updateCustomer(UUID id, CustomerRequest request){

        Customer customer = customerRepository.findById(id.toString()).orElseThrow(() -> new ResourceNotFoundException("Customer not found"));

        customer = customerMapper.toCustomer(request);
        customerRepository.save(customer);
        return customerMapper.toCustomerResponse(customer);

    }

    public void deleteCustomer(UUID id){
        Customer customer = customerRepository.findById(id.toString()).orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
        customerRepository.delete(customer);
    }
}
