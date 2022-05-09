package progpractice;

public class SeconLargestImArray 
{
	public static void main(String[] args) {
		int [] a= {4,5,3,1,11,14};
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
		System.out.println(smax);
	}

}
