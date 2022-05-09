package stringsProgs;

import java.util.LinkedHashSet;

public class CountNoOfChar 
{
	public static void main(String[] args)
	{
		String str="Testyantra";//t=3 e=1 s=1 y=1 a=2 n=1 r=1 
		String s = str.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			//System.out.println(s.charAt(i));
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
			
			System.out.print(ch+"="+count+" ");
		}
		
	}

}
