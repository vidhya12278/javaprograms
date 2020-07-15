package org.java;

import java.util.Scanner;

public class Evenodd10 
{
public static void main(String[] args) throws InterruptedException 
{
	//normal
	int r=12;
	System.out.println("first normal input given");
	System.out.println("given number : " + r);
	for (int i = 1; i <= r; i++) 
	{
	   if(i%2==0)
		{
			System.out.println("even number is : " + i);
		}
		else
		{
			System.out.println("odd number is : " + i);
		}
		
	   Thread.sleep(2000);
	   //using scanner to find even and odd in between value
	   Scanner s=new Scanner(System.in);

	   int y;
	   System.out.println("second using scanner to find even and odd");
	   System.out.println("enter value: ");
	   y = s.nextInt();
	   System.out.println("input value is : " + y);
	   for (int i1 = 1; i1 <= y; i1++) 
		{
		   if(i1%2==0)
			{
				System.out.println("even number is : " + i1);
			}
			else
			{
				System.out.println("odd number is : " + i1);
			}
		
		}
	}
}
}
		
		


