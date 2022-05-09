package progpractice;

import java.util.LinkedHashSet;

public class PosOfCharFromLastPos 
{
	public static void main(String[] args) 
	{
		String s="Tester";
		String s1 = s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character ch:set)
		{
			for(int i=s1.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.print(ch+"="+(i+1));
				}
			}
		}
		
	}

}
