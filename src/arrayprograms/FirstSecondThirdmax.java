package arrayprograms;

public class FirstSecondThirdmax 
{
	public static void main(String[] args)
	{
		int [] a= {30, 20, 10, 50, 40};
		int fmax=0;
		int smax=0;
		int tmax = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				tmax=smax;
				fmax=a[i];
				
			}
			else if(a[i]>smax)
			{
				tmax=smax;
				smax=a[i];
			}
			else
			{
				tmax=a[i];
			}
			
		}
		System.out.println("first max is "+fmax);
		System.out.println("second max is "+smax);
		System.out.println("third max is"+tmax);
		
		
	}

}
