package stringsProgs;

public class MockProg 
{
	public static void main(String[] args)
	{
		String s="abcdabcdabcd";
		//String s1 = s.replace(",", "");
		
		for (char ch = 'a'; ch <= 'z'; ch++)
		{
			int i;
			boolean flag = false;
			for ( i = 0; i < s.length(); i++) 
			{
				if (ch==s.charAt(i)) 
				{
					System.out.print(ch);
				
						flag=true;
				}
				
			}
			//if (flag) {
				//System.out.print(",");

			//}
		}
	}

}
