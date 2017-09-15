package com.tij4.pinchuk.chapter3;

/**
 * This class represents common principles how exponents value should be written.
 *
 * @author Maksym */
public class Exponents {

    public static void main(String[] args) {

        float f = 1.35e-10f;
        float f1 = (float) 1.35e-10;
        System.out.println("Float.MIN_VALUE: " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);

        double d = 1.35e-10d;
        double d1 = 1.35e-10;
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
    }

}
