package com.datasperling.company.crm.api.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public List<Employee> getEmployeeByEmployeeId(int employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    public List<Employee> getEmployeesByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(int employeeId, Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int employeeId, Employee employee) {
        employeeRepository.deleteById(employeeId);
    }

    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }
}
