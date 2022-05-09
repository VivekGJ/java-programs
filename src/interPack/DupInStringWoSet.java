package interPack;

import java.util.Iterator;

public class DupInStringWoSet {

	public static void main(String[] args) {
		String s="pavan is an upcoming swami swami";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < s1.length; j++) 
			{
				if(s1[i].equals(s1[j]))
{
	count++;
}
			}
			if(count>1)
			{
				System.out.println(s1[i]+" "+count);
			}
		}
	}

}
