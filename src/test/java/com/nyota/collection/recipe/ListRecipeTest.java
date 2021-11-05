package com.nyota.collection.recipe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.nyota.sample.recipe.Account;
import com.nyota.sample.recipe.AccountType;

import org.junit.Test;

public class ListRecipeTest {
    @Test
    public void testCreateArrayListOfAccounts() {
        ListRecipe lr = new ListRecipe();
        List<Account> list = lr.createArrayListOfAccounts(100000);
        int i = 1;
        for (Account account : list) {
            System.out.println(i + " " + account.toString());
            i++;
        }
    }

    @Test
    public void testCreateLinkedListOfAccounts() {
        ListRecipe lr = new ListRecipe();
        LinkedList<Account> list = lr.createLinkedListOfAccounts(100000);
        System.out.println(LocalDateTime.now());

        list.forEach(new Consumer<Account>() {
            int i = 1;
            public void accept(final Account account) {
                System.out.println(i + " " + account.toString());
                i++;
            }
        });
        System.out.println(LocalDateTime.now());
    }

    /**
     *Using the lambda expression to iterate and print the elements from the collection
     */
    @Test
    public void testCreateLinkedListOfAccountsUsingLambda() {
        ListRecipe lr = new ListRecipe();
        LinkedList<Account> list = lr.createLinkedListOfAccounts(100000);
        list.forEach((final Account account) -> System.out.println(account.toString()));
    }

    @Test
    public void testGetAccountTypes() {
        ListRecipe lr = new ListRecipe();
        List<Account> list = lr.createArrayListOfAccounts(10000);
        List<Account> newList = lr.getAccountTypes(list, AccountType.SAVINGS);
        newList.forEach((final Account account) -> System.out.println (account.toString()));
    }
}
