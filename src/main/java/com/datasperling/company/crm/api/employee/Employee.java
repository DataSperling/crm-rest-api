package com.datasperling.company.crm.api.employee;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {


    @Id
    private int id;
    @NaturalId
    private int employeeId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date enrollmentDate;
    private String gender;
    private String office;
    private String position;

    public Employee(int id, int employeeId, String firstName, String lastName, Date dateOfBirth, Date enrollmentDate, String gender, String office, String position) {
        this.id = id;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.enrollmentDate = enrollmentDate;
        this.gender = gender;
        this.office = office;
        this.position = position;
    }

    public Employee() {
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
            ", employeeId=" + employeeId +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", dateOfBirth=" + dateOfBirth +
            ", enrollmentDate=" + enrollmentDate +
            ", gender='" + gender + '\'' +
            ", office='" + office + '\'' +
            ", position='" + position + '\'' +
            '}';
    }
}