package interPack;

import java.util.LinkedHashSet;

public class NumberOfTimeCharRepeated 
{
	public static void main(String[] args) 
	{
		String s1="kholi is very good cricketer";
		String s = s1.replaceAll(" ", "");
		LinkedHashSet<Character>set= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(char ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.print(ch+""+count);
		}
		
	}

}
