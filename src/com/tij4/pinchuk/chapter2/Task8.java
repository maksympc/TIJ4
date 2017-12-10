package com.tij4.pinchuk.chapter2;

/**
 * This class represents solution for task8 in chapter 2 in TIJ4 book.
 *
 * @author Maksym
 * @version 1.0
 */
public class Task8 {

    static Object obj = new Object();

    public static void main(String[] args) {

        Task8 unit0 = new Task8();
        Task8 unit1 = new Task8();
        Task8 unit2 = new Task8();

        System.out.println("Is the static field of the class same for all class type objects?\n" +
                "Answer: " + (unit0.obj == unit1.obj && unit1.obj == unit2.obj));
    }
}
