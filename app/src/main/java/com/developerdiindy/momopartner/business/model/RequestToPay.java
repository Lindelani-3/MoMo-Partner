package com.developerdiindy.momopartner.business.model;

public class RequestToPay {

    private Long financialTransactionId;
    private Long externalId;
    private Double amount;
    private String currency;
    private PayerPayee payer;
    private String payerMessage;
    private String payeeNote;
    private String status;

    public RequestToPay(Long financialTransactionId, Long externalId,
                        Double amount, String status) {
        this.financialTransactionId = financialTransactionId;
        this.externalId = externalId;
        this.amount = amount;
        this.status = status;
    }

    public RequestToPay(Long externalId, Double amount, String currency, PayerPayee payer,
                        String payerMessage, String payeeNote) {
        this.externalId = externalId;
        this.amount = amount;
        this.currency = currency;
        this.payer = payer;
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
