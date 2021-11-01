package com.nyota.sample.recipe;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

public class AccountCreatorTest {

    AccountCreator acc;

    @Before
    public void createAccountCreator() {
        acc = new AccountCreator();
    }

    /**
     * This method will chck if the two account names created are not identical
     */
    @Test
    public void testCreateAccHolder() {
        String accHolder1 = acc.createAccHolder();
        String accHolder2 = acc.createAccHolder();
        System.out.println("Acc holder 1 " + accHolder1);
        System.out.println("Acc holder 2 " + accHolder2);
        assertTrue("Two names are not equal", !accHolder1.equals(accHolder2));
        assertNotEquals(accHolder1, accHolder2);
    }

    /**
     * This method will check if the method produces a name and not a blank
     */
    @Test
    public void testGetRandomName() {
        String randomName = acc.getRandomName();
        assertNotNull(randomName);
    }

    @Test
    public void testGetRandomDate() {
        LocalDateTime localdt = acc.getRandomDate(LocalDateTime.parse("23-10-1975"), LocalDateTime.parse ("23-10-2021"));
        System.out.println (localdt);
    }
}
