package arrayprograms;

public class FirstAndSecondMin 
{
	public static void main(String[] args) 
	{
		int [] a= {0,10, 12, 5,1, 11};
		int fmin=a[0];
		int smin=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin)
				{
				smin=fmin;
				
			}
				fmin=a[i];
			}	
			else if(fmin==smin||smin>a[i])
			{
				smin=a[i];
			}
		}
		System.out.println("first min is "+ fmin);
		System.out.println("second min is "+smin);
	}
}
