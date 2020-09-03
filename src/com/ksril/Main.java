package com.ksril;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        Fibonacci fibo =new Fibonacci();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        System.out.println(fibo.fibo(in.nextInt()));
    }
}
