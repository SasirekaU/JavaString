package com.capgi;

public class SwapTwoStrings {
	public static void main(String args[])
	{
String a="sasi";
String b="reka";
System.out.println("before swap: " +a + "" +b);
a=a+b;
b = a.substring(0, a.length() - b.length());  
a = a.substring(b.length());  

System.out.println("after swap: " +a +  ""  +b);
}
}
