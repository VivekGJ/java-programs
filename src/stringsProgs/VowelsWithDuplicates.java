package stringsProgs;

public class VowelsWithDuplicates 
{
	public static void main(String[] args) 
	{
		String s="testyantra";
		char[] ch = s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'|| ch[i]=='u')
			{
				count++;
				System.out.print(ch[i]);
			}
		}
		System.out.println("="+count);
		
	}

}
