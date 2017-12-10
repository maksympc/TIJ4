package com.tij4.pinchuk.chapter4;

/**
 * Task24. Chapter 4. TIJ4
 *
 * @author Maksym
 */
public class Task24 {

    static int[] parse(int number) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    static int[] parse(int num1, int num2) {
        int[] digits = new int[4];
        for (int i = 0; i < 2; i++) {
            digits[i] = num1 % 10;
            num1 /= 10;
            digits[i + 2] = num2 % 10;
            num2 /= 10;
        }
        return digits;
    }

    static boolean containsAll(int[] find, int[] dest) {
        for (int i = 0; i < dest.length; i++) {
            for (int j = 0; j < find.length; j++) {
                if (find[j] == dest[i]) {
                    find[j] = -1;
                    break;
                }
                if (j == find.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int multiplication;
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                multiplication = i * j;
                if (multiplication % 10 != 0) {
                    if (containsAll(parse(multiplication), parse(i, j))) {
                        System.out.println(i + "*" + j + "=" + multiplication);
                    }
                }
            }
        }
    }
}
