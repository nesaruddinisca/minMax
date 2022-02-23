package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter  second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter  third number: ");
        int num3 = input.nextInt();

        //find highest
        if (num1 > num2 && num1 > num3) {
            System.out.println("Highest : " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Highest : " + num2);
        } else {
            System.out.println("Highest : " + num3);
        }

        //find lowest
        if (num1 < num2 && num1 < num3) {
            System.out.println("Lowest : " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Lowest : " + num2);
        } else {
            System.out.println("Lowest : " + num3);
        }

    }
}
