package com.nyota.collection.recipe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.nyota.sample.recipe.Account;
import com.nyota.sample.recipe.AccountCreator;
import com.nyota.sample.recipe.AccountType;

/**
 * This class will involve all functions that are commonly used with the List
 * Collection
 */
public class ListRecipe {

    public static final AccountCreator accCreator = new AccountCreator();

    public ArrayList<Account> createArrayListOfAccounts(int x) {
        ArrayList<Account> listOfAcc = new ArrayList<Account>();
        for (int i = 0; i <= x; i++) {
            Account acc = accCreator.createAccount();
            listOfAcc.add(acc);
        }

        return listOfAcc;
    }

    public LinkedList<Account> createLinkedListOfAccounts(int x) {
        LinkedList<Account> listOfAcc = new LinkedList<Account>();
        for (int i = 0; i <= x; i++) {
            Account acc = accCreator.createAccount();
            listOfAcc.add(acc);
        }
        return listOfAcc;
    }

    /**
     * This method should produce the required account type from the list that is
     * provided
     * 
     * @param accType
     * @return
     */
    public List<Account> getAccountTypes(List<Account> list, AccountType accType) {
        List<Account> rtList = list.stream().filter(account ->  account.getAccountType().equals(accType)).collect(Collectors.toList());
        //Can not use allMatch as allMatch gives a boolean output.
        //List<Account> rtList = list.stream().allMatch(account -> account.getAccountType().equals(accType));

        return rtList;
    }

}
