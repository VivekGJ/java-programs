package interPack;

public class MinNumInGivenArray {

	public static void main(String[] args) 
	{
		int[]a= {2,2,54,63,71,22};
		int fmin=a[0];
		int smin=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		if(fmin==smin)
		{
			
		}
	}

}
