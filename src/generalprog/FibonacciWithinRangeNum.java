package generalprog;

public class FibonacciWithinRangeNum 
{
	public static void main(String[] args)
	{
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.print(fib1+" "+fib2);
		for(int i=0;i<100;i++)
		{
			fib3=fib1+fib2;
			if(fib3>=100)
			{
				break;
			}
			else
			{
				System.out.print(" "+fib3);
			}
			fib1=fib2;
			fib2=fib3;
			
		}
		
	}

}
