package interPack;

public class SumOfPairIs25 
{
	public static void main(String[] args) 
	{
		
		
		int []a= {7,13,12,18,10,16};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==25)
				{
					System.out.println(a[i]+" "+a[j]);
					
				}
				else
				{
					count++;
				}
			}
		}
		
	}

}
