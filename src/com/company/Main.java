package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        num = Integer.parseInt(input.nextLine());

        System.out.println("1   is not a prime number");

        boolean flag = false;

        for (int i = 2; i <= num; i++) {

            flag = false;


            for (int j = 2; j < i; j++) {


                if (i % j == 0) {
                    flag = true;
                    break;

                }

            }

            if (flag)
                System.out.println(i + "\t" + "is not a prime number");
            else
                System.out.println(i + "\t" + "is a prime Number");


        }
    }
}
































