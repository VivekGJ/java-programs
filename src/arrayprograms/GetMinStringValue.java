package arrayprograms;

public class GetMinStringValue 
{
	public static void main(String[] args) 
	{
		String [] str= {"a", "xyzz","qwe", "ipone", "b"};
		String smin=str[0];
		for(int i=0; i<str.length;i++)
		{
			if(smin.length()>str[i].length())
			{
				smin=str[i];
			}
		}
		for(int i=0;i<str.length;i++)
		{
			if(smin.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
		
		
	}

}
