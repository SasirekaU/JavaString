package com.capgi;

public class OccurenceOfString {
public static void main(String args[])
{
	String str="sasireka";
	char search='a';
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==search)
		{
			count++;
		}
	}
	System.out.println(" the character "  +search+  " occurs "   +count+  " times");
}
}
