package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner cardNumber = new Scanner(System.in);
        System.out.print("Enter a Credit Card Number: ");
        long Number;
        Number = cardNumber.nextLong();
        System.out.print("Credit Card Number: " + Number);
        int Sum = 0;

        String cardType = String.valueOf(Number);
        if (cardType.startsWith(" 4 ")) {
            System.out.print(" a Visa card ");
        } else if (cardType.startsWith(" 5 ")) {
            System.out.print(" a MasterCard " );
        } else if (cardType.startsWith(" 3 ")) {
            System.out.print(" an American Express card ");
        }
        while (Number > 0)
            Number = Number / 10;

        if (Number % 2!= 0) {
            Number *= 2;
        }

        if (Number > 9) {
            Number = (Number % 10) + 1;
        } else
            Number *= 1;
        Sum += Number;

        if (Sum % 10 == 0) {
            System.out.println(" is valid.");
        } else
            System.out.println(" is invalid. Please try again.");
    }
}