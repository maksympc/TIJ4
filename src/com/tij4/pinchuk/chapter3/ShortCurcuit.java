package com.tij4.pinchuk.chapter3;

/**
 * This class represents short curcuit for logic operators.
 * test3() is never execute.
 *
 * @author Maksym
 */
public class ShortCurcuit {

    static boolean test1(int val) {
        boolean result = 1 < val;
        System.out.println("test1, result:" + result);
        return result;
    }

    static boolean test2(int val) {
        boolean result = 2 < val;
        System.out.println("test2, result:" + result);
        return result;
    }

    static boolean test3(int val) {
        boolean result = 3 < val;
        System.out.println("test3, result:" + result);
        return result;
    }

    public static void main(String[] args) {
        boolean result = test1(2) && test2(2) && test3(2);
    }
}
