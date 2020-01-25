package com.hackerrank.practice.jan;

import java.util.Scanner;

public class intExpression {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int n = 0;
		int temp = 0;
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			a = in.nextInt();
			b = in.nextInt();
			n = in.nextInt();
			temp = (a + (int) Math.pow(2, 0) * b);
			System.out.print(temp + " ");
			for (int j = 1; j < n; j++) {
				temp = temp + (int) Math.pow(2, j) * b;
				System.out.print((temp) + " ");

			}
			System.out.println();
		}
		in.close();

	}

}
