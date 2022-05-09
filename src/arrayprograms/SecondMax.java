package arrayprograms;

public class SecondMax 
{
	public static void main(String[] args) 
	{
		int [] a= {10, 3, 11, 5, 15};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(a[1]);
	}


}
