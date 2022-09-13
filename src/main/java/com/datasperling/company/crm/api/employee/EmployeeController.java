package com.datasperling.company.crm.api.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * MVC controller for CRUD operations on Employee objects
 */
@RestController
public class EmployeeController {

    /*
     * singleton member variable for DI
     */
    @Autowired
    private EmployeeService employeeService;

    /*
     * getAllEmployees()
     * @return: all employees in DB
     */
    @RequestMapping(method=RequestMethod.GET, value="/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    /*
     * get employee by employeeId
     */
    @RequestMapping(method=RequestMethod.GET, value="/employees/EmployeeId/{employeeId}")
    public List<Employee> getEmployeeByEmployeeId(@PathVariable int employeeId) {
        List<Employee> employee = employeeService.getEmployeeByEmployeeId(employeeId);
        if (employee.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format(
                "Employee with employee id %d not found", employeeId));
        }
        return employee;
    }

    /*
     * get employee by firstName
     */
    @RequestMapping(method=RequestMethod.GET, value="/employees/FirstName/{firstName}")
    public List<Employee> getEmployeesByFirstName(@PathVariable("firstName") String firstName) {
        List<Employee> employee = employeeService.getEmployeesByFirstName(firstName);
        if (employee.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format(
                "Employee with first name %s not found", firstName));
        }
        return employee;
    }

    /*
     * addEmployee(@RequestBody Employee employee)
     */
    @RequestMapping(method=RequestMethod.POST, value="/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    /*
     * updateEmployee(@PathVariable Integer id, @RequestBody Employee employee)
     */
    @RequestMapping(method=RequestMethod.PUT, value="/employees/{employeeId}")
    public void updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee) {
        employeeService.updateEmployee(employeeId, employee);
    }

    /*
     * deleteEmployee(@PathVariable Integer id)
     */
    @RequestMapping(method=RequestMethod.DELETE, value="/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId, @RequestBody Employee employee) {
        employeeService.deleteEmployee(employeeId, employee);
    }

    /*
     * deleteEmployees()
     */
    @RequestMapping(method=RequestMethod.DELETE, value="/employees")
    public void deleteAllEmployees() {
        employeeService.deleteAllEmployees();
    }
}

