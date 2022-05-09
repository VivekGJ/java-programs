package arrayprograms;

public class PrintMaxStringValueInArr 
{
	public static void main(String[] args) 
	{
		String [] str= {"a", "ab", "abc","abcd", "abced", "apple"};
		String max=str[0];
		for(int i=0; i<str.length;i++)
		{
			if(max.length()<str[i].length())
			{
				max=str[i];
			}
		}
		for(int i=0;i<str.length;i++)
		{
			if(max.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
	}

}
