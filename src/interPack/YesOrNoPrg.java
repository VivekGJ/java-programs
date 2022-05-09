package interPack;

import java.util.Scanner;

public class YesOrNoPrg 
{
	
	public void demo(String s)
	{
		
		
		int l=s.length();
		
		if(l%2==1)
		{
			System.out.println("no");
		}
		
		int i=0;
		int j=l-1;
	    while(i<j)
	    {
	    	if(s.charAt(i)!='a'|| s.charAt(j)!='b')
	    	{
	    		System.out.println("no");
	    	}
	    	
	    	else
	    	{
	    		System.out.println("yes");
	    	}
	    	i++;
	    	j--;
	    }
	    
	   
		
		
	}
	public static void main(String[] args) 
	{
		
		YesOrNoPrg yn= new YesOrNoPrg();
		System.out.println();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		
		yn.demo(s);
	}

}
