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
     * getAllEmployees()
     * @return: all employees in DB
     */
    @RequestMapping(method=RequestMethod.GET, value="/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    /*
     * getEmployee(@PathVariable Integer employeeId)
     * @return: employee with employeeId
     */
    @RequestMapping(method=RequestMethod.GET, value="/employees/{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable Integer employeeId) {
        return employeeService.getEmployee(employeeId);
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
    public void updateEmployee(@PathVariable Integer employeeId, @RequestBody Employee employee) {
        employeeService.updateEmployee(employeeId, employee);
    }

    /*
     * deleteEmployee(@PathVariable Integer id)
     */
    @RequestMapping(method=RequestMethod.DELETE, value="/employees/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId, @RequestBody Employee employee) {
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

