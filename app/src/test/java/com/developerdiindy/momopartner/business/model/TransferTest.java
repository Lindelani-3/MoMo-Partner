package com.developerdiindy.momopartner.business.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransferTest {

    Transfer transfer;

    @Test
    void testTransferModel() {
        PayerPayee payee = new PayerPayee("partyId");
        transfer = new Transfer("FIN-ID", "EX_ID", 99.99, "SZL", payee,  "payeeMessage", "payeeNote", "GOOD");
        transfer = new Transfer("EX-ID", 100.01, "SZL", payee, "payeeNote", "payerMessage");
        transfer.setExternalId("New_EX-ID");
        assertEquals("New_EX-ID", transfer.getExternalId());
        transfer.setFinancialTransactionId("New_FIN-ID");
        assertEquals("New_FIN-ID", transfer.getFinancialTransactionId());
        transfer.setAmount(2.2);
        assertEquals(2.2, transfer.getAmount());
        transfer.setCurrency("SZL");
        assertEquals("SZL", transfer.getCurrency());
        transfer.setPayee(payee);
        assertEquals("partyId", transfer.getPayee().getPartyId());
        transfer.setPayerMessage("Message");
        assertEquals("Message", transfer.getPayerMessage());
        transfer.setPayeeNote("Note");
        assertEquals("Note", transfer.getPayeeNote());
        transfer.setStatus("STATUS");
        assertEquals("STATUS", transfer.getStatus());
    }
}