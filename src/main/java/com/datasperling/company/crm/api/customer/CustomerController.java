package com.datasperling.company.crm.api.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /*
     * @return: all customers in DB
     */
    @RequestMapping(method=RequestMethod.GET, value="/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    /*
     * @return: all customers associated with a specific employeeId
     */
    @RequestMapping(method=RequestMethod.GET, value="/employees/{employeeId}/customers")
    public List<Customer> getAllCustomers(@PathVariable Integer employeeId) {
        return customerService.getAllCustomers(employeeId);
    }

    /*
     * @return: specific customer with id=customerId
     */
    @RequestMapping(method=RequestMethod.GET, value="/customers/{customerId}")
    public Optional<Customer> getCustomer(@PathVariable Integer customerId) {
        return customerService.getCustomer(customerId);
    }

    @RequestMapping(method=RequestMethod.POST, value="/customers")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/customers/{customerId}")
    public void updateCustomer(@PathVariable Integer customerId, @RequestBody Customer customer) {
        customerService.updateCustomer(customerId, customer);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="customers/{customerId}")
    public void deleteCustomer(@PathVariable Integer customerId, @RequestBody Customer customer) {
        customerService.deleteCustomer(customerId, customer);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="customers")
    public void deleteAllCustomers() {
        customerService.deleteAllCustomers();
    }
}
