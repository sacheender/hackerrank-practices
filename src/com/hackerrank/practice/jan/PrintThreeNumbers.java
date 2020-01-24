package com.hackerrank.practice.jan;

import java.util.Scanner;

public class PrintThreeNumbers {

	public static void main(String[] args) {
		int no=3;
		int[] a = new int[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			a[i]=scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
