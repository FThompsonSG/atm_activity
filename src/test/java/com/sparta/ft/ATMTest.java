package com.sparta.ft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ATMTest {

    private ATM test = new ATM();

    @Test
    void withdrawValue() {
        Assertions.assertEquals("""
                Customer withdraws £157

                3 x £50
                1 x £5
                1 x £2

                Value quantity of units
                50 9
                20 20
                10 50
                5 99
                2 249
                1 500
                """, test.withdrawValue(157));
    }

}