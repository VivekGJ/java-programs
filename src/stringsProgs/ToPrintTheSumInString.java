package stringsProgs;

public class ToPrintTheSumInString 
{
	public static void main(String[] args) 
	{
		String s="abc45de12fg1"; //13
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')// based on the ascii values
			{
				int n=s.charAt(i)-48; // 0=48 
				sum=sum+n;
			}
		}
		System.out.println(sum);
		
	}

}
