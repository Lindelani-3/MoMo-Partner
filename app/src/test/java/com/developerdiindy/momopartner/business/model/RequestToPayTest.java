package com.developerdiindy.momopartner.business.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RequestToPayTest {

    RequestToPay requestToPay;

    @Test
    void testRequestToPayModel() {
        PayerPayee payee = new PayerPayee("partyId");
        requestToPay = new RequestToPay("FIN-ID", "EX_ID", 99.99, "GOOD");
        requestToPay = new RequestToPay("EX-ID", 100.01, "SZL", payee, "payeeNote", "payerMessage");
        requestToPay.setExternalId("New_EX-ID");
        assertEquals("New_EX-ID", requestToPay.getExternalId());
        requestToPay.setFinancialTransactionId("New_FIN-ID");
        assertEquals("New_FIN-ID", requestToPay.getFinancialTransactionId());
        requestToPay.setAmount(2.2);
        assertEquals(2.2, requestToPay.getAmount());
        requestToPay.setCurrency("SZL");
        assertEquals("SZL", requestToPay.getCurrency());
        requestToPay.setPayer(payee);
        assertEquals("partyId", requestToPay.getPayer().getPartyId());
        requestToPay.setPayerMessage("Message");
        assertEquals("Message", requestToPay.getPayerMessage());
        requestToPay.setPayeeNote("Note");
        assertEquals("Note", requestToPay.getPayeeNote());
        requestToPay.setStatus("STATUS");
        assertEquals("STATUS", requestToPay.getStatus());
    }
}