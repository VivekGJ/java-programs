package interPack;

public class FindTheMissingNum 
{
	public static void main(String[] args)
	{
		int [] a= {1,2,4,8,10,12};
		int n=1;
		for(int i=0;i<a.length;i++)
		{
			n++;
		}
		int sumOfDigit=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int missingdigit=sumOfDigit-sum;
		System.out.println("missing number is "+missingdigit);
		
		
	}

}
