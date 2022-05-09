package arrayprograms;

public class BubbleSortDesc
{
	public static void main(String[] args)
	{
		int [] a= {8, 3, 4, 9, 11};
		for(int i=0;i<a.length;i++)
		{
			for(int j= i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i]; // a[i] is empty and moved to temp
					a[i]=a[j];    // move a[j] to a[i] and a[j] is empty
					a[j]=temp;    // a[j] is empty move temp to a[j]
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");	
		}
		
	}
	
}
