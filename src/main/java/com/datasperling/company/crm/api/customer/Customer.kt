package com.datasperling.company.crm.api.customer

import java.util.Date;

data class Customer (
        val customerId: Int,
        val firstName: String,
        val secondName: String,
        val companyName: String,
        val emailAddress: String,
        val businessDomain: String,
        val dateAcquisition: Date)




