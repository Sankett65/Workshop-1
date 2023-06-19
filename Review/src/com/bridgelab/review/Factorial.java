package com.bridgelab.review;


import java.util.Scanner;

//       find  Factorial Program in Java
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1;i<=n;i++){
            fact= fact * i;
        }
        System.out.println("The factorail of the " +n+ " is= " +fact);  //-------5!=5*4*3*2*1=120
    }
}
