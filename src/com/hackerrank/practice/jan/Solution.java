package com.hackerrank.practice.jan;

import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int maxStringLen = 15;
		int maxIntLen = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String line = "";
			
			String s1 = sc.next();
			int x = sc.nextInt();
			
			// string
			int stringLen = s1.length();
			int diff = maxStringLen - stringLen;
			if (diff > 0) {
				for (int j = 0; j < diff; j++) {
					line += " ";
				}
			}
			line = s1+line;

			//int
			int intLen = String.valueOf(x).length();
			int intdiff = maxIntLen-intLen;
			if(intdiff>0) {
				for (int j = 0; j < intdiff; j++) {
					line+="0";
				}
			}
			System.out.println(line+x);
		}
		System.out.println("================================");

	}

}
