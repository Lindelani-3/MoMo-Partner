package com.developerdiindy.momopartner.business.model;

public class PayerPayee {

    private String partyIdType = "MSISDN";
    private Long partyId;

    public PayerPayee(String partyIdType, Long partyId) {
        this.partyIdType = partyIdType;
        this.partyId = partyId;
    }

    public String getPartyIdType() {
        return partyIdType;
    }

    public void setPartyIdType(String partyIdType) {
        this.partyIdType = partyIdType;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }
}
