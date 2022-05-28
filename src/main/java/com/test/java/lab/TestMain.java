package com.test.java.lab;

public class TestMain {


    public static void main(String[] args) {
        int startingValue = args.length > 0 && args[0] != null ? Integer.parseInt(args[0]) : 0;
        int counter = startingValue;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
}
