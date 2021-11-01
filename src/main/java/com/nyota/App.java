package com.nyota;

import com.nyota.sample.recipe.AccountType;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        AccountType act = AccountType.CHECKING;
        System.out.println(act.getMinimumAmt());

    }
}
