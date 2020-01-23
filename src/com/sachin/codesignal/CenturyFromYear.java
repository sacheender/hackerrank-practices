package com.sachin.codesignal;

public class CenturyFromYear {
	
	
	public static void main(String[] args) {
	
		System.out.println(new CenturyFromYear().centuryFromYear(1905));
	}

	
	int centuryFromYear(int year) {

		return ((year%100)==0)?(year/100):(year/100+1);
		
	}
	

}
