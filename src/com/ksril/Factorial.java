package com.ksril;

public class Factorial {

    public int fac(int n){
        if(n==0 || n==1)
            return 1;
        else{
            return n * fac(n-1);
        }
    }
}
