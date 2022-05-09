package interPack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UsingCollectionFirstMin 
{
	public static void main(String[] args) 
	{
		int [] a= {10,4,2,3,1,88,11,4,1};
		ArrayList<Integer> set=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
			
		}
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			break;
		}
	
//		for (int i = 0; i <=0;i++) {
//			System.out.println(set.size());
//		}
//		
//	   for(Integer no:set)
//	   {
//		   System.out.print(no+" ");
//	   }
		
		
	}

}
