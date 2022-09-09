package com.datasperling.company.crm.api.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {

    @Id
    private Integer customerId;
    private String firstName;
    private String secondName;
    private String companyName;
    private String emailAddress;
    private String businessDomain;
    private Date dateAcquisition;

    public Customer(Integer customerId,
                    String firstName,
                    String secondName,
                    String companyName,
                    String emailAddress,
                    String businessDomain,
                    Date dateAcquisition) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.companyName = companyName;
        this.emailAddress = emailAddress;
        this.businessDomain = businessDomain;
        this.dateAcquisition = dateAcquisition;
    }

    public Customer() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBusinessDomain() {
        return businessDomain;
    }

    public void setBusinessDomain(String businessDomain) {
        this.businessDomain = businessDomain;
    }

    public Date getDateAcquisition() {
        return dateAcquisition;
    }

    public void setDateAcquisition(Date dateAquisition) {
        this.dateAcquisition = dateAquisition;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "firstName='" + firstName + '\'' +
            ", secondName='" + secondName + '\'' +
            ", companyName='" + companyName + '\'' +
            ", emailAddress='" + emailAddress + '\'' +
            ", businessDomain='" + businessDomain + '\'' +
            ", dateAcquisition=" + dateAcquisition +
            '}';
    }
}
