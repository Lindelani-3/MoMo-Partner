package com.developerdiindy.momopartner.business.model;

public class Balance {

    private Double amount;
    private String currency = "SZL";

    public Balance(Double amount) {
        this.amount = amount;
    }

    public Balance(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
