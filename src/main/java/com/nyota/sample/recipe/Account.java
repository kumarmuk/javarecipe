package com.nyota.sample.recipe;

import java.time.LocalDateTime;

/**
 * This class is sample objects.
 */
public class Account {

    private int id;
    private String accountHolder;
    private AccountType accountType;
    private LocalDateTime accountOpening;
    private Boolean accountStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public LocalDateTime getAccountOpening() {
        return accountOpening;
    }

    public void setAccountOpening(LocalDateTime accountOpening) {
        this.accountOpening = accountOpening;
    }

    public Boolean getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
}
