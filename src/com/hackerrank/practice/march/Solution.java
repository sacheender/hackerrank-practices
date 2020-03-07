package com.hackerrank.practice.march;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

//        Currency
//        NumberFormat.getCurrencyInstance()
//        NumberFormat.getCurrencyInstance();
        
        NumberFormat instance = NumberFormat.getCurrencyInstance(Locale.US);
        instance.setMaximumFractionDigits(2);
        String us = instance.format(payment);
        
         instance = NumberFormat.getCurrencyInstance(Locale.CHINA);
        instance.setMaximumFractionDigits(2);
        String china = instance.format(payment);
        
         instance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        instance.setMaximumFractionDigits(2);
        String france = instance.format(payment);
        
        instance = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        instance.setMaximumFractionDigits(2);
        String india = instance.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
