package arrayprograms;

import java.util.LinkedHashSet;

public class CountNoDuplicate 
{
	public static void main(String[] args)
	{
		int [] a= {7,8,11,13,7,11,15};
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for (Integer no : set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(no==a[i])
				{
					count++;
				}
			}
			if(count>1)
			{
			System.out.println(no+"="+count+" ");
			}
		}
		
	}

}
