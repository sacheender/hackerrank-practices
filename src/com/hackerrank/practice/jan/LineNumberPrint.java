package com.hackerrank.practice.jan;

import java.util.Scanner;

public class LineNumberPrint {

	public static void main(String []argh)
    {
		Scanner scanner = new Scanner(System.in);
		int lineNumber = 0;
		while(scanner.hasNext()) {
			System.out.println(++lineNumber +" "+ scanner.nextLine());
		}
		scanner.close();
		
    }
}
