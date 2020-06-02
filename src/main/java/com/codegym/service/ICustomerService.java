package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomer();
    Customer getCustomerById(String id);
    boolean saveCustomer(Customer customer);
    boolean removeCustomerById(String id);
    boolean updateCustomerById(String id, Customer customer);
}
