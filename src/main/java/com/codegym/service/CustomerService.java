package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
  static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer("1", "phi", "0987654321"));
        customers.add(new Customer("2", "dao", "0987654322"));
        customers.add(new Customer("3", "van", "0987654323"));
        customers.add(new Customer("4", "le", "0987654324"));
        customers.add(new Customer("5", "dat", "0987654325"));
    }
    @Override
    public List<Customer> getAllCustomer() {
        return customers;
    }

    @Override
    public Customer getCustomerById(String id) {
        return null;
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        customers.add(customer);
        return true;
    }

    @Override
    public boolean removeCustomerById(String id) {
        return false;
    }

    @Override
    public boolean updateCustomerById(String id, Customer customer) {
        return false;
    }
}