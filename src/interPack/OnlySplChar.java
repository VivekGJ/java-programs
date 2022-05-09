package interPack;

public class OnlySplChar 
{
	public static void main(String[] args) 
	{
		String s="asd123!@as#12$?><";
		for(int i=0;i<s.length();i++)
		{
			if(!((s.charAt(i)>='a' && s.charAt(i)<='z'||s.charAt(i)>='A'&& s.charAt(i)<='Z'||s.charAt(i)>='1'&& s.charAt(i)<='9')))
				
			{
				System.out.print(s.charAt(i));
			}
			
		}
		
	}

}
