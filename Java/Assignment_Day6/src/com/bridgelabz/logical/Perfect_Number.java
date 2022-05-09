package com.bridgelabz.logical;

import java.util.Scanner;

public class Perfect_Number {

    static int isPerfect_Num(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Factors of the number are :" + i);
                sum = sum + i;
            }
        }
        System.out.println("Sum of the Factors: "+sum);
        return sum;
    }

    public static void main(String[] args) {
        int number, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();
        s = isPerfect_Num(number);
        if (s == number)
            System.out.println(number+ " is a Perfect Number");
            else {
                System.out.println(number + " is not a Perfect Number");
        }
    }
}
