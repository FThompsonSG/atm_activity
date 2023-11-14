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

    public Currency getFifty() {
        return fifty;
    }

    public void setFifty(Currency fifty) {
        this.fifty = fifty;
    }

    public Currency getTwenty() {
        return twenty;
    }

    public void setTwenty(Currency twenty) {
        this.twenty = twenty;
    }

    public Currency getTen() {
        return ten;
    }

    public void setTen(Currency ten) {
        this.ten = ten;
    }

    public Currency getFive() {
        return five;
    }

    public void setFive(Currency five) {
        this.five = five;
    }

    public Currency getTwo() {
        return two;
    }

    public void setTwo(Currency two) {
        this.two = two;
    }

    public Currency getOne() {
        return one;
    }

    public void setOne(Currency one) {
        this.one = one;
    }

    public ArrayList<Currency> getATMTotal() {
        return ATMTotal;
    }

    public void setATMTotal(ArrayList<Currency> ATMTotal) {
        this.ATMTotal = ATMTotal;
    }

    public void withdrawValue(int amount) {

        System.out.println("Customer withdraws £" + amount);

        for (Currency currency : ATMTotal) {
            int remainder = amount % currency.getValue();
            remainder = remainder % currency.getValue();

//            int remainder = amount / currency.getValue();
//            System.out.println(remainder + " x £" + currency.getValue());

//            System.out.println(currency.getQuantity() + " x £" + currency.getValue());
        }

    }

    @Override
    public String toString() {
        return "ATM{" +
                "fifty=" + fifty +
                ", twenty=" + twenty +
                ", ten=" + ten +
                ", five=" + five +
                ", two=" + two +
                ", one=" + one +
                ", ATMTotal=" + ATMTotal +
                '}';
    }

}
