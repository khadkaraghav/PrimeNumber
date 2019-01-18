package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        num = Integer.parseInt(input.nextLine());

        boolean flag = false;

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {

                flag = true;
                break;
            }
        }
                if (flag)
                    System.out.println(num+"\t"+ "is not a prime number");
                else if (!flag)
                System.out.println(num+"\t"+ "is a prime Number");


        }
    }



























