package interPack;

import java.util.Scanner;

public class NumEndsWith5 
{

	public void five()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		for (int i = 0; i <100; i++) 
		{
			if(i%10==num)
			{
				System.out.print(i+" ");
			}
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		NumEndsWith5 num=new NumEndsWith5();
		num.five();
	}

}
