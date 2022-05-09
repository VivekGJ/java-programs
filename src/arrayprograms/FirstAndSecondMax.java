package arrayprograms;

public class FirstAndSecondMax 
{
	public static void main(String[] args)
	{
		int [] a= {30, 20, 10, 50, 40};
		int fmax=0;
		int smax=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
				
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
			
		}
		System.out.println("first max is "+fmax);
		System.out.println("second max is "+smax);
		
	}

}
