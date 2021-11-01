package com.nyota.sample.recipe;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class will be used to create the acounts
 */
public class AccountCreator {

    int numOfAccounts = 0;
    private static Random random = new Random();

    public Account createAccount() {
        Account acc = new Account();
        acc.setAccountHolder(this.createAccHolder());
        acc.setAccountOpening(this.getRandomDate(LocalDateTime.parse ("23/10/1976"), LocalDateTime.parse ("23/10/2021")));
        //acc.setAccountStatus(accountStatus);
        //acc.setAccountType(accountType);
        //acc.setId(id);
        return acc;
    }

    //
    public String createAccHolder() {
        return this.getRandomName() + "." + this.getRandomName();
    }

    //Get a random name from the string of 24 characters
    public String getRandomName() {
        final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randomNameLength = random.nextInt(24);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < randomNameLength; i++) {
            sb.append(upper.charAt(random.nextInt(upper.length())));
        }
        return sb.toString();
    }


    public LocalDateTime getRandomDate (LocalDateTime startDate, LocalDateTime endDate) {
        long startMilliSeconds = startDate.toEpochSecond(ZoneOffset.UTC);
        long endMilliSeconds = endDate.toEpochSecond(ZoneOffset.UTC);
        long randomDate = ThreadLocalRandom.current().nextLong(startMilliSeconds, endMilliSeconds);
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(randomDate, 0, ZoneOffset.UTC); 
        return localDateTime;
    }

}
