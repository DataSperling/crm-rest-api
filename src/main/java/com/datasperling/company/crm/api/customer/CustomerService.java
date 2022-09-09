package com.datasperling.company.crm.api.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    /*
     * getAllCustomers()
     * @return: all customers in DB
     */
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    /*
     * getAllCustomers(@PathVariable Integer employeeId)
     * @return: all customers associated with a specific employeeId
     */
    public List<Customer> getAllCustomers(Integer employeeId) {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    /*
     * getCustomer(Integer id)
     * @return: customer with id-customerId
     */
    public Optional<Customer> getCustomer(Integer customerId) {
        return customerRepository.findById(customerId);
    }


    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void updateCustomer(Integer customerId, Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer customerId, Customer customer) {
        customerRepository.deleteById(customerId);
    }

    public void deleteAllCustomers() {
        customerRepository.deleteAll();
    }
}
