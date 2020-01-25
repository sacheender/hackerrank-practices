package com.hackerrank.practice.jan;

import java.util.Scanner;

public class ShortBytFit {

	public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                
                //8
                if(x>=-Math.pow(2, 7) && x<=Math.pow(2, 7)-1)System.out.println("* byte");
                //16
                if(x>=-(Math.pow(2, 15)) && x<=(Math.pow(2, 15)-1))System.out.println("* short");
                
                //32
                if(x>=-Math.pow(2, 31) && x<=(Math.pow(2, 31)-1))System.out.println("* int");
                
                //64
                if(x>=-(Math.pow(2, 63)) && x<=(Math.pow(2, 63)-1))System.out.println("* long");
                
                
               
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
