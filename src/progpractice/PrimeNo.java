package progpractice;

public class PrimeNo
{
	public static void main(String[] args) 
	{
		
		for(int i=2;i<=100;i++)
		{
			int num=i;
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
			if(num%j==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("it s a prime "+num);
		}
		else
		{
			System.out.println("it is not a prime "+num);
		}
		
	}

}
}
