package com.developerdiindy.momopartner.business.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QRPaymentTest {

    QRPayment qrPayment;

    @Test
    void testQRPaymentModel() {
        qrPayment = new QRPayment("API-USER-ID", 100.01, "SZL", "EX-ID");
        qrPayment = new QRPayment(111, "API-USER-ID", 100.01, "SZL", "EX-ID");
        qrPayment.setQrPaymentId(101);
        qrPayment.setApiUserId("API-ID");
        qrPayment.setAmount(202.02);
        qrPayment.setCurrency("EUR");
        qrPayment.setExternalId("Ex-Id");
        assertEquals(101, qrPayment.getQrPaymentId());
        assertEquals("API-ID", qrPayment.getApiUserId());
        assertEquals(202.02, qrPayment.getAmount());
        assertEquals("EUR", qrPayment.getCurrency());
        assertEquals("Ex-Id", qrPayment.getExternalId());
    }
}