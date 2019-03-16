package com.Hashinology.Java;

import java.util.Scanner;

public class Main {
    public static double x;
    public static double y;

    public static void main(String[] args) {


        calcs(x, y);
    }

    public static void calcs(double number1, double number2) {
        Scanner input = new Scanner(System.in);

        System.out.println("Put the First Number: ");

        String numb1 = input.nextLine();

        number1 = Double.parseDouble(numb1);

        System.out.println("Put the Second Number: ");

        String numb2 = input.nextLine();

        number2 = Double.parseDouble(numb1);

        System.out.println("choose the operation");

        char inputOps = input.next().charAt(0);

        switch (inputOps) {
            case '+':
                System.out.println("result is: " + String.valueOf(number1 + number2));
                break;

            case '/':
                if (number1 != 0) {
                    System.out.println("result is: " + String.valueOf(number1 / number2));
                } else {
                    System.out.println(" you cant use this!");
                }
                break;

            case '*':
                System.out.println("result is: " + String.valueOf(number1 * number2));
                break;

            case '-':
                System.out.println("result is: " + String.valueOf(number1 - number2));
                break;
            default:
                System.out.println("Something goes Wrong Choose the Right Input");
        }

    }
    }
