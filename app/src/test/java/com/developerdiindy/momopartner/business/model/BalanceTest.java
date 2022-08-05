package com.developerdiindy.momopartner.business.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BalanceTest {

    Balance balance;

    @Test
    void testBalanceModelFunctionality() {
        balance = new Balance(900.09);
        balance = new Balance(11.01, "SZL");
        balance.setAmount(234.56);
        balance.setCurrency("EUR");
        assertEquals(234.56, balance.getAmount());
        assertEquals("EUR", balance.getCurrency());
    }
}