package interPack;

public class StringRepeatedOneWord 
{
	public static void main(String[] args) 
	{
		String s="malayalam";
		int count=0;
		char ch='a';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+"="+count);
		
	}

}
