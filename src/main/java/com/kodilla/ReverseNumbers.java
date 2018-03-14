package com.kodilla;

public class ReverseNumbers {
    public static void main(String[] args) {
        int result=toRev(123);
        System.out.println(result);
    }
    public static int toRev(int num){
        int num2=0;
        while(num>0){
        num2=num2*10+num%10;
        num=num/10;}
        return num2;
    }
}
