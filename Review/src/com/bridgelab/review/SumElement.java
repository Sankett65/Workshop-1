package com.bridgelab.review;



//    Java Program to print the sum of all the items of the array
public class SumElement {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};  // 1+2+3+4+5=15
        int sum=0;
        int i =0;
        for ( i =0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of all the item of the array is: " +sum);
    }
}
