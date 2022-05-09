package stringsProgs;

import java.util.LinkedHashSet;

public class ToPrintVowelsWithoutDuplicates 
{
	public static void main(String[] args) 
	{
		String s="testyantra";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		int count=0;
		for(Character ch:set)
		{
			

				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
					System.out.print(ch);
				}
			}
			System.out.println("="+count);
		}
		
	}


