package com.nyota.sample.recipe;

public enum AccountType {
    CORPORATE(1), SAVINGS(2), CHECKING(3);

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
