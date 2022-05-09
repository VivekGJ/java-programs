package arrayprograms;

import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length");
		int a = sc.nextInt();
	
		int b[]=new int[a];
		System.out.println("enter  the values");
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
			System.out.println(b[i]);
		}
		
		
		
	}

}
