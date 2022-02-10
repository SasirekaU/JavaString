package com.capgi;
import java.util.Scanner;
public class ReverseString {
public static void main(String args[])
{
	String s1,rev="";
	System.out.println("enter a string:");
	Scanner sc=new Scanner(System.in);
	s1=sc.nextLine();
	int length = s1.length();
	for(int i=length-1;i>0;i--)
	{
		rev= rev +s1.charAt(i);
	}
	
	System.out.println("reverse of string: " +rev);
}
}
