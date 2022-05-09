package stringsProgs;

public class RemoveTheSpaceAndPrintString
{
	public static void main(String[] args) 
	{
		String str="Welcome to Bengaluru";
		String[] s = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
		
	}

}
