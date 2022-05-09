package progpractice;

public class PracticeSpl 
{
	public static void main(String[] args) 
	{
		String s="!@#123we!@12WEER23";
		String s1=" ";
		String s2=" ";
		String s3=" ";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				s1=s1+s.charAt(i);
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				s2=s2+s.charAt(i);
			}
			else
			{
				s3=s3+s.charAt(i);
			}
		}
		System.out.print(s1+s2+s3);
		
	}

}
