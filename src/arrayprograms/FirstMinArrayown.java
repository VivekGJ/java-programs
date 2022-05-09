package arrayprograms;

public class FirstMinArrayown
{
	public static void main(String[] args)
	{
		int [] a= {4, 11, 6, 14, 2};
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("minimum num is "+min);
	}

}
