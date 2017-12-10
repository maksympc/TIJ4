package com.tij4.pinchuk.chapter3;

/**
 * Task14. Chapter 3. TIJ4
 *
 * @author Maksym
 */
public class Task14 {

    static void StringTest(String a, String b) {
        System.out.println("String logic comparison has been started:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        // forbidden comparison
        //System.out.println("a > b :" + a > b);
        //System.out.println("a < b :" + a < b);
        //System.out.println("a >= b :" + a >= b);
        //System.out.println("a <= b :" + a <= b);

        // allowed comparison
        System.out.println("a != b : " + (a != b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
    }

    public static void main(String[] args) {

        StringTest("a", "a");
        StringTest(new String("a"), new String("a"));
        StringTest("a", "b");

    }


}
