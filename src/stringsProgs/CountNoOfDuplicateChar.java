package stringsProgs;

import java.util.LinkedHashSet;

public class CountNoOfDuplicateChar 
{
	public static void main(String[] args) 
	{
		String s="samsunggalaxy";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) // to take each values
		{
			set.add(s.charAt(i)); // add to set remove the duplicates
		}
		for(Character ch:set) // navigate through each values
		{
			int count=0;  // initial count =0
			for(int i=0;i<s.length();i++) // comparing with each we need this loop
			{
				if(ch==s.charAt(i)) // comparing
				{
					count++; // increase the count
				}
			}
			if(count>1)
			{
				System.out.print(ch+"="+count+" ");
			}
			
		}
		
	}

}
