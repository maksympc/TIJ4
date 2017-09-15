package com.tij4.pinchuk.chapter2;

/**
 * This class contains main method that prints System properties
 *
 * @version 1.0
 * @author Maksym maksympc@gmail.com
 * */
public class ShowSystemProperties {

    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println("=======================================================================");

        System.out.println(System.getProperty("user.name"));
        System.out.println("=======================================================================");

        System.out.println(System.getProperty("java.library.path"));
        System.out.println("=======================================================================");
    }

}
