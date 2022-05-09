package stringsProgs;

public class ReverseStatementAtPos 
{
	public static void main(String[] args) 
	{
		String s="I am in TestYantra";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String s1=str[i];
			//System.out.print(s1);
			for(int j=s1.length()-1;j>=0;j--)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
				
		}
		
	}

}
