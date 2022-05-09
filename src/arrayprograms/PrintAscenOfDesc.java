package arrayprograms;

public class PrintAscenOfDesc
{
	public static void main(String[] args) 
	{
		int [] a= {11, 13, 2, 7, 0, 15};
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int k=a.length-1;k>=0;k--)
		{
			System.out.print(a[k]+" ");
		}
		
	}

}
