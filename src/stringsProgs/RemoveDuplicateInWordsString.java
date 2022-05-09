package stringsProgs;

import java.util.LinkedHashSet;

public class RemoveDuplicateInWordsString 
{
	public static void main(String[] args) 
	{
		String s="Welcome to to TestYantra";
		String[] str = s.split(" "); // convert into array 
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for (String str1 : str) // to add the elements into set
		{
			System.out.println(str1);
			set.add(str1);
			System.out.println(set);
			
		}
		for(String str2:set) // navigate through each element
		{
			int count=0;
			for(String str3:str) // to compare with set elements 
			{
				if(str3.equals(str2))
				{
					count++;
				}
			}
			System.out.print(str2+"="+count+" ");
		}
		
	}

}
