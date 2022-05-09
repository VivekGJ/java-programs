package stringsProgs;

import java.util.LinkedHashSet;

public class CountWithOutDuplicateInWords 
{
	public static void main(String[] args) 
	{
		String s="Welcome to to India";
		String[] str = s.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for(String str1:str)
		{
			set.add(str1);
		}
		for(String str2:set)
		{
			int count=0;
			for(String str3:str)
			{
				if(str3.equals(str2))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(str2+"="+count);
			}
		}
		
	}

}
