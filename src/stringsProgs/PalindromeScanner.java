package stringsProgs;

import java.util.Scanner;

public class PalindromeScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		String s = sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
		
	}

}
