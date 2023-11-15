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

        System.out.println("Customer withdraws £" + amount + "\n");

        int dispensedNotes;

        if ((amount - 50) >= 0) {
            dispensedNotes = amount / 50;
            amount = amount - (dispensedNotes * 50);

            System.out.printf("%s x £50%n", dispensedNotes);
            fifty.setQuantity(fifty.getQuantity() - dispensedNotes);
        }


        if ((amount - 20) >= 0) {
            dispensedNotes = amount / 20;
            amount = amount - (dispensedNotes * 20);

            System.out.printf("%s x £20%n", dispensedNotes);
            twenty.setQuantity(twenty.getQuantity() - dispensedNotes);
        }

        if ((amount - 10) >= 0) {
            dispensedNotes = amount / 10;
            amount = amount - (dispensedNotes * 10);

            System.out.printf("%s x £10%n", dispensedNotes);
            ten.setQuantity(ten.getQuantity() - dispensedNotes);
        }

        if ((amount - 5) >= 0) {
            dispensedNotes = amount / 5;
            amount = amount - (dispensedNotes * 5);

            System.out.printf("%s x £5%n", dispensedNotes);
            five.setQuantity(five.getQuantity() - dispensedNotes);
        }

        if ((amount - 2) >= 0) {
            dispensedNotes = amount / 2;
            amount = amount - (dispensedNotes * 2);

            System.out.printf("%s x £2%n", dispensedNotes);
            two.setQuantity(two.getQuantity() - dispensedNotes);
        }

        if ((amount - 1) >= 0) {
            dispensedNotes = amount;
            amount = 0;

            System.out.printf("%s x £1%n", dispensedNotes);
            one.setQuantity(one.getQuantity() - dispensedNotes);
        }

        System.out.println("\nValue quantity of units");
        for (Currency currency : ATMTotal) {
            System.out.println(currency.getValue() + " " + currency.getQuantity());
        }

    }


}
