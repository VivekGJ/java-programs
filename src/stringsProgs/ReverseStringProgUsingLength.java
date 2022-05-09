package stringsProgs;

public class ReverseStringProgUsingLength
{
	public static void main(String[] args) 
	{
		String s="james";
		System.out.println(s.length());
		System.out.println("*****");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
