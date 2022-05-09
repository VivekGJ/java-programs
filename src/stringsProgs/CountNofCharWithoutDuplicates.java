package stringsProgs;

import java.util.LinkedHashSet;

public class CountNofCharWithoutDuplicates 
{
	public static void main(String[] args) 
	{
		String s="solarsystem"; //o=1 l=1 a=1 r=1 y=1 t=1 e=1 m=1
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(ch+"="+count+" ");
			}
			
		}
		
	}

}
