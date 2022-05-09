package generalprog;

public class NumberPalidrome 
{
	public static void main(String[] args) 
	{
		int no=5;   // % will give last digit    //  '/' will remove the last digit
		int rev=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			  rev=(rev*10)+rem;
			  no=no/10;
		}
		if(rev==copy)
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palidrome");
		}
		
	}

}
