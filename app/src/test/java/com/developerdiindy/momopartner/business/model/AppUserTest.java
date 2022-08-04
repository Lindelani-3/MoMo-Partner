package com.developerdiindy.momopartner.business.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class AppUserTest {

    public AppUser appUser;

    @Before
    public void setup(){
        appUser = new AppUser();
    }

    @Test
    public void testAppUserModel() {
        appUser = new AppUser("Steve", "Rogers", "cap@email.com", "password");
        appUser.setId(101);
        assertEquals(101, appUser.getId());
        appUser.setFirstName("Marc");
        assertEquals("Marc", appUser.getFirstName());
        appUser.setLastName("Spectre");
        assertEquals("Spectre", appUser.getLastName());
        appUser.setEmail("moon@email.com");
        assertEquals("moon@email.com", appUser.getEmail());
        appUser.setPassword("12345");
        assertEquals("12345", appUser.getPassword());
    }

}