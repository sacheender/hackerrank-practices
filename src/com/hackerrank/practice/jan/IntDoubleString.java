package com.hackerrank.practice.jan;

import java.util.Scanner;

public class IntDoubleString {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Integer i = Integer.parseInt(scan.nextLine());
        Double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

}
