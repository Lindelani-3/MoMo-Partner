package com.developerdiindy.momopartner.business.model;

public class QRPayment {

    private int qrPaymentId;
    private String apiUserId;
    private double amount;
    private String currency;
    private String externalId;

    public QRPayment(String apiUserId, double amount, String currency, String externalId) {
        this.apiUserId = apiUserId;
        this.amount = amount;
        this.currency = currency;
        this.externalId = externalId;
    }

    public QRPayment(int qrPaymentId, String apiUserId, double amount, String currency, String externalId) {
        this.qrPaymentId = qrPaymentId;
        this.apiUserId = apiUserId;
        this.amount = amount;
        this.currency = currency;
        this.externalId = externalId;
    }

    public int getQrPaymentId() {
        return qrPaymentId;
    }

    public void setQrPaymentId(int qrPaymentId) {
        this.qrPaymentId = qrPaymentId;
    }

    public String getApiUserId() {
        return apiUserId;
    }

    public void setApiUserId(String apiUserId) {
        this.apiUserId = apiUserId;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
}
