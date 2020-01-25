package com.hackerrank.practice.jan;

import java.util.Scanner;

public class BreadHeightCompare {

	static boolean flag;
	static int B;
	static int H;

	static {
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();
		if (B <= 0 || H <= 0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
		scanner.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
		

	}// end of main

}
