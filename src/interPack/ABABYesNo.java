package interPack;

import java.util.Scanner;

public class ABABYesNo
{
	public static void main(String[] args)
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter the string");
	  String s = sc.next();
	
	  
	  int count1=0;
	  int count2=0;
	  int count3=0;
	  for(int i=0;i<s.length()-1;i++)
	  {
		  if(s.charAt(i)==s.charAt(i+1))
		  {
			  count1++;
		  }
		  else
		  {
			  count3=count1;
			  count1=0;
			  count2++;
			  
		  }
		  
	  }
	  if(count3!=count1)
	  {
		  System.out.println("no");
	  }
	  else if(count2==count1)
	  {
		 System.out.println("yes"); 
	  }
	  else
	  {
		  System.out.println("no");
	  }
		
	}

}
