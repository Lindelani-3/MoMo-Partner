package com.developerdiindy.momopartner.business.model;

public class PayerPayee {

    private String partyIdType = "MSISDN";
    private String partyId;

    public PayerPayee(String partyId) {
        this.partyId = partyId;
    }

    public PayerPayee(String partyIdType, String partyId) {
        this.partyIdType = partyIdType;
        this.partyId = partyId;
    }

    public String getPartyIdType() {
        return partyIdType;
    }

    public void setPartyIdType(String partyIdType) {
        this.partyIdType = partyIdType;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
}
