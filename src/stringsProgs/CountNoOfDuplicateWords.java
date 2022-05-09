package stringsProgs;

import java.util.LinkedHashSet;

public class CountNoOfDuplicateWords 
{
	public static void main(String[] args)
	{
		String s="Welcome to to KGF";     // 0      1    2   3
		String[] str = s.split(" ");// str{welcome, to, to, KGF}
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for (String str1 : str) 
		{
			set.add(str1);  // [welcome, to, KGF]
			
		}
		for(String str2:set)// [welcome, to, KGF]
		{
			int count=0;
			for(String str3:str)
			{
				if(str3.equals(str2))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(str2+"="+count);
			}
		}
		
	}

}
