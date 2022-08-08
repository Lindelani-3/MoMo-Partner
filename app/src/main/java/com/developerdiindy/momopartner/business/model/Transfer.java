package com.developerdiindy.momopartner.business.model;

public class Transfer {

    private String financialTransactionId;
    private String externalId;
    private double amount;
    private String currency;
    private PayerPayee payee;
    private String payerMessage;
    private String payeeNote;
    private String status;

    public Transfer(String financialTransactionId, String externalId, double amount,
                    String currency, PayerPayee payee, String payerMessage, String payeeNote, String status) {
        this.financialTransactionId = financialTransactionId;
        this.externalId = externalId;
        this.amount = amount;
        this.currency = currency;
        this.payee = payee;
        this.payerMessage = payerMessage;
        this.payeeNote = payeeNote;
        this.status = status;
    }

    public Transfer(String externalId, double amount, String currency, PayerPayee payee,
                    String payerMessage, String payeeNote) {
        this.externalId = externalId;
        this.amount = amount;
        this.currency = currency;
        this.payee = payee;
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

    public PayerPayee getPayee() {
        return payee;
    }

    public void setPayee(PayerPayee payee) {
        this.payee = payee;
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
