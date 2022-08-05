package com.developerdiindy.momopartner.business.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Date;

class AccessTokenTest {

    AccessToken accessToken;

    @Test
    void testAccessTokenModelFunctionality() {
        accessToken = new AccessToken("DJFKSo0083kC");
        accessToken.setToken("NewToken");
        accessToken.setUserId(101);
        accessToken.setDateCreated(new Date(1999, 05, 03));     // toDo use proper date type
        assertEquals("NewToken", accessToken.getToken());
        assertEquals(101, accessToken.getUserId());
        assertEquals(new Date(1999, 05, 03), accessToken.getDateCreated());
    }
}