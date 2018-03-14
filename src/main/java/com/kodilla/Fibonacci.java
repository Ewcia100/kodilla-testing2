package com.kodilla;

public class Fibonacci {
    public static void main(String[] args) {
        int fib5=fib(5);
        int fib6=fib(6);
        System.out.println(fib6);
    }
    public static int fib(int n){
        int first=0;

        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
