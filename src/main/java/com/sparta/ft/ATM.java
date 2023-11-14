package com.sparta.ft;

import java.util.ArrayList;

public class ATM {

    private Currency fifty;
    private Currency twenty;
    private Currency ten;
    private Currency five;
    private Currency two;
    private Currency one;
    private ArrayList<Currency> ATMTotal = new ArrayList<>();

    public ATM() {
        fifty = new Currency(50, 12);
        twenty = new Currency(20, 20);
        ten = new Currency(10, 50);
        five = new Currency(5, 100);
        two = new Currency(2, 250);
        one = new Currency(1, 500);
        ATMTotal.add(fifty);
        ATMTotal.add(twenty);
        ATMTotal.add(ten);
        ATMTotal.add(five);
        ATMTotal.add(two);
        ATMTotal.add(one);
    }

    public void withdrawValue(int amount) {

        System.out.println("Customer withdraws £" + amount);

        for (Currency currency : ATMTotal) {
            if (amount % currency.getValue() == 0) {

            }
            System.out.println(currency.getQuantity() + " x £" + currency.getValue());
        }

    }

}
