package com.datasperling.backendapplication.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * getAll()
     */
    @RequestMapping(method=RequestMethod.GET, value="/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    /*
     * getById(@PathVariable Integer id)
     */
    @RequestMapping(method=RequestMethod.GET, value="/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployee(id);
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
    @RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        employeeService.updateEmployee(id, employee);
    }

    /*
     * deleteEmployee(@PathVariable Integer id)
     */
    @RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
    public void deleteEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        employeeService.deleteEmployee(id, employee);
    }

    /*
     * deleteEmployees()
     */
    @RequestMapping(method=RequestMethod.DELETE, value="/employees")
    public void deleteAllEmployees() {
        employeeService.deleteAllEmployees();
    }
}

