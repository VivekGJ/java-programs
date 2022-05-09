package progpractice;

public class MockByMe 
{
	public static void main(String[] args) 
	{
		String s="abcdabcdabcd";
		char[] str = s.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			if(str[i]=='a')
			{
				System.out.print(str[i]);
			}
			else if(str[i]=='b')
			{
				System.out.print(str[i]);
			}
			else if(str[i]=='c')
			{
				System.out.print(str[i]);
			}
			else
			{
				System.out.print(str[i]);
			}
			
		}
		
	}

}
