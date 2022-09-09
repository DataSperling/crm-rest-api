package com.datasperling.company.crm.api.employee;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * CRUDRepository is a generic so need to supply type
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {


  /**
   * find by employeeId rather than @Id using JPQL
   * @param employeeId the instance variable to search by
   * @return a List<Employee> of employee(s) with employeeId matching GET request
   */
  @Query("SELECT e FROM Employee e WHERE e.employeeId in :employeeId")
  List<Employee> findByEmployeeId(@Param("employeeId") int employeeId);

  @Query("SELECT en FROM Employee en WHERE en.firstName in :firstName")
  List<Employee> findByFirstName(@Param("firstName") String firstName);
}
