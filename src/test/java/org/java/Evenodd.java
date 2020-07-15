package org.java;

import java.util.Scanner;

public class Evenodd {
public static void main(String[] args) 
{
	
//normal input given
int y1=3;

System.out.println("first normal output for even or odd");
System.out.println("input value is : " + y1);
if(y1%2==0)
{
	System.out.println("given number is even");
}
else
{
	System.out.println("given number is odd");
}
	
	//using scanner to find even or odd value
Scanner s=new Scanner(System.in);

int y;
System.out.println("second using scanner to find even or odd");
System.out.println("enter value: ");
y = s.nextInt();
System.out.println("input value is : " + y);

if(y%2==0)
{
	System.out.println("given number is even");
}
else
{
	System.out.println("given number is odd");
}



















}
}
