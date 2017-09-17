package com.tij4.pinchuk.chapter4;

/**
 * Task23. Chapter 4. TIJ4
 *
 * @author Maksym
 */
public class Task23 {

    static void printFibSequence(int size) {
        if (size < 1)
            return;
        int prevFibNumber = 1;
        int currentFibNumber = 1;
        int exchange;
        System.out.print(prevFibNumber + ", ");
        if (size == 1) {
        } else {
            for (int i = 1; i < size; i++) {
                System.out.print(currentFibNumber + ", ");
                exchange = currentFibNumber;
                currentFibNumber += prevFibNumber;
                prevFibNumber = exchange;
            }
        }
    }

    public static void main(String[] args) {
        printFibSequence(15);
    }
}
