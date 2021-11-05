package com.nyota.sample.recipe;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class will be used to create the acounts
 */
public class AccountCreator {

    int numOfAccounts = 0;
    private static Random random = new Random();
    private static final AccountType[] accountTypeValues = AccountType.values();
    public static final int accStart = 1111111111;
    public static final int accEnd = 999999999;
    public static final LocalDateTime startDate = LocalDateTime.parse("23-10-1975 00:00:00",
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    public static final LocalDateTime endDate = LocalDateTime.parse("23-10-2021 00:00:00",
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

    public Account createAccount() {
        Account acc = new Account();
        acc.setAccountHolder(this.createAccHolder());
        acc.setAccountOpening(this.getRandomDate(startDate, endDate));
        acc.setAccountStatus(this.getRandomStatus());
        acc.setAccountType(this.getRandomAccountType());
        acc.setId(this.getRandomAccountNumber());
        return acc;
    }

    //
    public String createAccHolder() {
        return this.getRandomName() + "." + this.getRandomName();
    }

    // Get a random name from the string of 24 characters
    public String getRandomName() {
        final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randomNameLength = random.nextInt(24);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < randomNameLength; i++) {
            sb.append(upper.charAt(random.nextInt(upper.length())));
        }
        return sb.toString();
    }

    public LocalDateTime getRandomDate(LocalDateTime startDate, LocalDateTime endDate) {
        long startMilliSeconds = startDate.toEpochSecond(ZoneOffset.UTC);
        long endMilliSeconds = endDate.toEpochSecond(ZoneOffset.UTC);
        long randomDate = ThreadLocalRandom.current().nextLong(startMilliSeconds, endMilliSeconds);
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(randomDate, 0, ZoneOffset.UTC);
        return localDateTime;
    }

    public Boolean getRandomStatus() {
        int randomInt = random.nextInt(2);
        if (randomInt > 0)
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    /**
     * this method will be used to get the random account type
     * 
     * @return
     */
    public AccountType getRandomAccountType() {
        int index = random.nextInt(accountTypeValues.length);
        return accountTypeValues[index];
    }

    /**
     * This method will generate an int value that can be used as Id
     * 
     * @return
     */
    public int getRandomAccountNumber() {
        return (int) Math.floor(Math.random() * AccountCreator.accEnd) + AccountCreator.accStart;
    }
}
