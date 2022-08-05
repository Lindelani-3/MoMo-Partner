package com.developerdiindy.momopartner.business.model;

public class Transfer {

    private Long financialTransactionId;
    private Long externalId;
    private Double amount;
    private String currency;
    private PayerPayee payee;
    private String payerMessage;
    private String payeeNote;
    private String status;

    public Transfer(Long externalId, Double amount, String currency, PayerPayee payee, String payerMessage, String payeeNote) {
        this.externalId = externalId;
        this.amount = amount;
        this.currency = currency;
        this.payee = payee;
        this.payerMessage = payerMessage;
        this.payeeNote = payeeNote;
    }

    public Long getFinancialTransactionId() {
        return financialTransactionId;
    }

    public void setFinancialTransactionId(Long financialTransactionId) {
        this.financialTransactionId = financialTransactionId;
    }

    public Long getExternalId() {
        return externalId;
    }

    public void setExternalId(Long externalId) {
        this.externalId = externalId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
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
