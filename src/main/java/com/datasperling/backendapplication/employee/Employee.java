package com.datasperling.backendapplication.employee;


import javax.persistence.Entity;
import javax.persistence.Id;

/*
* Entity class for employee objects
 */
@Entity
public class Employee {

    @Id
    private Integer employeeId;
    private String name;
    private String office;
    private String position;

    public Employee() {
    }

    public Employee(Integer employeeId, String name, String office, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.office = office;
        this.position = position;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", office='" + office + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
