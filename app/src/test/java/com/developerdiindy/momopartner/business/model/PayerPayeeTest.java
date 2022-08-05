package com.developerdiindy.momopartner.business.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PayerPayeeTest {

    public PayerPayee payerPayee;

    @Test
    public void testPayerPayeeModel() {
        payerPayee = new PayerPayee("12LMJ78");
        payerPayee = new PayerPayee("", "202L");
        payerPayee.setPartyId("303L");
        assertEquals("303L", payerPayee.getPartyId());
        payerPayee.setPartyIdType("MSISDN");
        assertEquals("MSISDN", payerPayee.getPartyIdType());
    }
}