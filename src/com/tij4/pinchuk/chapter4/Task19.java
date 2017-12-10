package com.tij4.pinchuk.chapter4;

/**
 * Task19. Chapter 4. TIJ4
 *
 * @author Maksym
 */
public class Task19 {

    public static void main(String[] args) {

        long a = (long) (Math.random()*Long.MAX_VALUE);
        System.out.println(String.format("%" + 22 + "s", "a:") + a);
        System.out.println("Long.toBinaryString():" + Long.toBinaryString(a));
        System.out.print(String.format("%" + 22 + "s", "In cycle:"));
        for(int i = 63; i >= 0; i--){
            System.out.print( ((a>>i)&1) == 1 ? 1 : 0);
        }

    }

}
