package com.ksril;

public class PrimeSelector {

    public int prime(int n) {
        //int m = n/2;
        if(n==0 || n==1)
            return 0;
        else if(n==2)
            return n;
        else{
            for(int i=2;i<n;i++){
                if(n%i==0)
                    return 0;
            }
            return n;
        }
    }
}
