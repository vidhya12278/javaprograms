package org.java;

public class EvenoddCount
{
public static void main(String[] args) 
{

	int even=0, odd=0;
	for (int i = 1; i <= 100; i++) 
	{
		if(i%2==0)
		{
			even++;
			//System.out.println("even count value : " + even);
		}
		else
		{
			odd++;
			//System.out.println("odd count value : " + odd);
		}
	}
	System.out.println("odd count : " + odd);
	System.out.println("even count : " + even);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
