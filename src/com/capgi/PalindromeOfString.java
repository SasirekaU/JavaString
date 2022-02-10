package com.capgi;
import java.util.*;
public class PalindromeOfString {
public static void main(String args[])
{
	String str,b="";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	str=sc.nextLine();
	int n=str.length();
	for(int i=n-1;i>=0;i--)
	{
		b= b + str.charAt(i);
	}
	if(str.equalsIgnoreCase(b))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
