package splProg;

public class NonZeroNumSegr
{
	public static void main(String[] args)
	{
		int [] a= {1,2,0,5,2,0,3,0};
		int m=0;
		int n=a.length-1;
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[m]=a[i];
				m++;
			}
			else
			{
				b[n]=a[i];
				n--;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
