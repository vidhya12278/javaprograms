package org.java;

import java.util.Scanner;

public class Panlidrome 
{
public static void main(String[] args) 
{
int num=12121, r=0,s=0;
int n=num;
	
	while(num>0)
	{
		r=num%10;
		s=(s*10) + r;
		num=num/10;
	}
	//System.out.println("reverse: " + s);
	if(n==s)
	{
		System.out.println("given number is a palindrome ");
	}
	else
	{
		System.out.println("given number is not palindrome ");
	}
/*	
//using scanner
	Scanner p=new Scanner(System.in);
	String y = p.nextLine();
	System.out.println("enter value : " + y);
	int l=y.length();
	int j=0,k=0;
	int d=l;
	while(l>0)
	{
		j=l%10;
		k=(k*10) + j;
		l=l/10;
	}
	
	if(d==k)
	{
		System.out.println("given number is a palindrome ");
	}
	else
	{
		System.out.println("given number is not palindrome ");
	}	
	
*/	
	
	
	
}

}
