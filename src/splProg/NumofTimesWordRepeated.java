package splProg;

public class NumofTimesWordRepeated 
{
	public static void main(String[] args) 
	{
		String[] s= {"test","Tester","Testing","smarTest","Delhi"};
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].toLowerCase().contains("test"))
			{
				count++;
				System.out.println(s[i]+" ");
			}
		}
		System.out.println(count);
	}

}
