package stringsProgs;

public class CountNoOfVowelsInString 
{
	public static void main(String[] args) 
	{
		String s="iamokay";
		char[] ch = s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println("Number of vowels is "+count);
		
	}

}
