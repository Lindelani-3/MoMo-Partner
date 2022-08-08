package com.developerdiindy.momopartner.business.model;

public class RequestToPay {

    private String financialTransactionId;
    private String externalId;
    private double amount;
    private String currency;
    private PayerPayee payer;
    private String payerMessage;
    private String payeeNote;
    private String status;

    public RequestToPay(String financialTransactionId, String externalId,
                        double amount, String status) {
        this.financialTransactionId = financialTransactionId;
        this.externalId = externalId;
        this.amount = amount;
        this.status = status;
    }

    public RequestToPay(String externalId, double amount, String currency, PayerPayee payer,
                        String payerMessage, String payeeNote) {
        this.externalId = externalId;
        this.amount = amount;
        this.currency = currency;
        this.payer = payer;
        this.payerMessage = payerMessage;
        this.payeeNote = payeeNote;
    }

    public String getFinancialTransactionId() {
        return financialTransactionId;
    }

    public void setFinancialTransactionId(String financialTransactionId) {
        this.financialTransactionId = financialTransactionId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
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

    public PayerPayee getPayer() {
        return payer;
    }

    public void setPayer(PayerPayee payerPayee) {
        this.payer = payerPayee;
    }

    public String getPayerMessage() {
        return payerMessage;
    }

    public void setPayerMessage(String payerMessage) {
        this.payerMessage = payerMessage;
    }

    public String getPayeeNote() {
        return payeeNote;
    }

    public void setPayeeNote(String payeeNote) {
        this.payeeNote = payeeNote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
