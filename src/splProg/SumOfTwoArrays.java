package splProg;

public class SumOfTwoArrays 
{
	public static void main(String[] args) 
	{
		int [] a= {1,3,5};
		int [] b= {2,4,8,11};
		int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		for(int i=0;i<count;i++)
		{
			try
			{
				System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e)
			{
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.print(b[i]);
				}
			}
		}
		
	}

}
