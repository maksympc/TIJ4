package com.tij4.pinchuk.chapter3;

/**
 * Task10. Chapter 3. TIJ4
 *
 * @author Maksym
 */
public class Task10 {

    public static void main(String[] args) {
        int a = 0xAAAAAAAA;
        int b = 0x55555555;
        System.out.println("a: " + Integer.toBinaryString(a));
        System.out.println("b: " + Integer.toBinaryString(b));

        System.out.println("a&b: " + Integer.toBinaryString(a & b));
        System.out.println("a|b: " + Integer.toBinaryString(a | b));
        System.out.println("a^b: " + Integer.toBinaryString(a ^ b));
        System.out.println("~a: " + Integer.toBinaryString(~a));
        System.out.println("~b: " + Integer.toBinaryString(~b));
    }
}
