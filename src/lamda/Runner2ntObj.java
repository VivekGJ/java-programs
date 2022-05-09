package lamda;

public class Runner2ntObj
{
	public static void main(String[] args) 
	{
		LamdaExp lm=new LamdaExp()
				{

					@Override
					public void demo() 
					{
						System.out.println("implemenation is done");
						
					}
			
				};
	
				lm.demo();
	}

}
