package com.datasperling.backendapplication.employee;

import org.springframework.data.repository.CrudRepository;

/**
 * CRUDRepository is a generic so need to supply type
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    // only need to implement non-standard methods CRUD already implemented
}
