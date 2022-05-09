package progpractice;

public class Numberpalidrome
{
	public static void main(String[] args) 
	{
		int no=121;
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
			System.out.println("palindrome "+rev);
		}
		
	}

}
