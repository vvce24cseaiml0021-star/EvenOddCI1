package com.example.evenodd;

public class EvenOdd {
	public static String checkEvenOdd(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Main method
    public static void main(String[] args) {

        int number = 10;

        String result = checkEvenOdd(number);

        System.out.println(number + " is " + result);
    }

}
