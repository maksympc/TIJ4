package com.tij4.pinchuk.chapter4;

import java.util.Random;

/**
 * Task16. Chapter 4. TIJ4
 *
 * @author Maksym
 */
public class Task16 {

    static void testNumbers(int a, int b) {
        System.out.println(".......................");
        System.out.println("a=" + a + " , b=" + b);
        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
        System.out.println(".......................");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int prev = rand.nextInt(10);
        int current;

        for (int i = 0; i < 24; i++) {
            current = rand.nextInt(10);
            testNumbers(prev, current);
            prev = current;
        }

    }
}
