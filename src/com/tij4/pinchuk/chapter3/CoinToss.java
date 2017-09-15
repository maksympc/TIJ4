package com.tij4.pinchuk.chapter3;

import java.util.Random;

/**
 * This class enables to model the coin toss process
 *
 * @author Maksym
 */
public class CoinToss {

    public static void main(String[] args) {
        System.out.println("Is avers?\n" +
                "Answer: " + (new Random().nextInt(2) % 2 == 0));
    }
}
