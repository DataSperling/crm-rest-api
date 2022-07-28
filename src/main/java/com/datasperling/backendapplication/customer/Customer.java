package com.datasperling.backendapplication.customer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private Integer customerId;
    private String name;
    private String firm;
    private String business;

    public Customer(Integer customerId, String name, String firm, String business) {
        this.customerId = customerId;
        this.name = name;
        this.firm = firm;
        this.business = business;
    }

    public Customer() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer id) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", firm='" + firm + '\'' +
                ", business='" + business + '\'' +
                '}';
    }
}
