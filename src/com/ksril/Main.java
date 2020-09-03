package com.ksril;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        Fibonacci fibo =new Fibonacci();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        System.out.println(fibo.fibo(in.nextInt()));

//        PrimeSelector prime = new PrimeSelector();
//        int num = prime.prime(in.nextInt());
//        if(num==0)
//            System.out.println("Not a prime.");
//        else
//            System.out.println(num + " is prime.");
    }
}
