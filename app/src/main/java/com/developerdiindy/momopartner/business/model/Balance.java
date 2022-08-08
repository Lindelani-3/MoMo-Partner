package com.developerdiindy.momopartner.business.model;

public class Balance {

    private double amount;
    private String currency = "SZL";

    public Balance(double amount) {
        this.amount = amount;
    }

    public Balance(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
