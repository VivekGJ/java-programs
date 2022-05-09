package generalprog;

public class PrimeNo 
{
	public static void main(String[] args) 
	{
		int no=7;
		boolean flag=true;
		if(no<=1)
		{
			flag=false;
		}
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("it is a prime No");
		}
		else
		{
			System.out.println("it is not a prime No");
		}
		
	}

}
