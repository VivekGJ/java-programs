package stringsProgs;

public class ToSegregateCharctersInString 
{
	public static void main(String[] args) 
	{
		String s="!@QW&*(asd125fQWE12";
		String alp=" ";
		String num=" ";
		String splCh=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z' || s.charAt(i)>='a'&& s.charAt(i)<='z')

			{
				alp=alp+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				splCh=splCh+s.charAt(i);
			}
		}
		System.out.print(alp+num+splCh);
	}

}
