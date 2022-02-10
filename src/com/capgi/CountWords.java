package com.capgi;
import java.util.Scanner;
public class CountWords {
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		str=sc.nextLine();
		int wordcount=0;

		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				wordcount++;
		}
		System.out.println("no.of words:" +(wordcount+1));
	}

}
