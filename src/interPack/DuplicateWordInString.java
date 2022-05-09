package interPack;

import java.util.LinkedHashSet;

public class DuplicateWordInString 
{
	public static void main(String[] args) 
	{
		String s="JAVA PROGRAM JAVA";
		String[] str = s.split(" ");
		LinkedHashSet<String>set= new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			
			set.add(str[i]);
		}
		for(String str1:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(str1.equals(str[i]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(count+" "+str1);
			}
		}
		
		
	}

}
