package splProg;

public class CountCharWithPos 
{
	public static void main(String[] args) 
	{
		String s="aabbbcccab";
		int count=1;
		
		for(int i=0;i<s.length();i++)
		{
			try 
			{	
			
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
			  System.out.print(s.charAt(i)+""+count);
			  count=1;
			}
		}
			catch(Exception e)
			{
				System.out.print(s.charAt(i)+""+count);
			}
		}
		
	}

}
