package arrayprograms;

 public class BubbleSortAsc 
{

	public static void main(String[] args) 
	{
		int  a []= {10,50,30,40,20};
		
		for(int i=0;i<a.length;i++) // it will take the 0th(a[0])index value
		{
			for(int j=i+1;j<a.length;j++) // it will compare from 0th (a[1]) index
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
for(int k=0;k<a.length;k++)
	System.out.print(a[k]+" ");
	}
	
}
