package com.developerdiindy.momopartner.business.model;

public class RequestToPay {

    private Long financialTransactionId;
    private Long externalId;
    private Double amount;
    private String currency;
    private PayerPayee payerPayee;
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

    public RequestToPay(Long financialTransactionId, Long externalId,
                        Double amount, String currency, PayerPayee payerPayee,
                        String payerMessage, String payeeNote, String status) {
        this.financialTransactionId = financialTransactionId;
        this.externalId = externalId;
        this.amount = amount;
        this.currency = currency;
        this.payerPayee = payerPayee;
        this.payerMessage = payerMessage;
        this.payeeNote = payeeNote;
        this.status = status;
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
        return payerPayee;
    }

    public void setPayer(PayerPayee payerPayee) {
        this.payerPayee = payerPayee;
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
