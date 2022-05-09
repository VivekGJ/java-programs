package generalprog;

public class PrimeNumFrom0To100
{
	public static void main(String[] args) 
	{
		for(int k=2;k<=100;k++)
		{
			int no=k;
			boolean falg=true;
			for(int i=2;i<k;i++)
			{
				if(no%i==0)
				{
					falg=false;
					break;
				}
			}
			if(falg==true)
			{
				System.out.println("it is prime num "+no);
				
			}
			else
			{
				System.out.println("it is not a prime num "+no);
			}
		}
		
	}

}
