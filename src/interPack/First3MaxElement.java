package interPack;

public class First3MaxElement 
{
	public static void main(String[] args) 
	{
		int [] a= {7,-3,0,2,1,-9};
		int fmax=0;
		int smax=0;
		int tmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				tmax=smax;
				smax=fmax;
				fmax=a[i];
				
			}
			else if(a[i]>smax)
			{
				tmax=smax;
				smax=a[i];
			}
			else if(a[i]>tmax)
			{
				tmax=a[i];
			}
			
		}
		System.out.print(fmax*smax*tmax);
		
	}

}
