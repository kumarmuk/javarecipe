package com.nyota.sample.recipe;

public enum AccountType {
    CORPORATE(10000), SAVINGS(50), CHECKING(50);

    public int getMinimumAmt() {
        return minimumAmt;
    }

    public void setMinimumAmt(int minimumAmt) {
        this.minimumAmt = minimumAmt;
    }

    private int minimumAmt;

    private AccountType (int minAmt) {
        this.minimumAmt = minAmt;
    }

}
