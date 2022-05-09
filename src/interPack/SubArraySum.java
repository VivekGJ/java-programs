package interPack;

public class SubArraySum {

	public static void main(String[] args) {
		int[] arr= {15,51,7,81,5,11,25};
		int[] arr1=new int[arr.length];
		int sum=41;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				arr1[i]=arr[i]+arr[j];
				if(arr1[i]==sum)
				{
					System.out.println(sum+"-->"+arr[i]+" "+arr[j]);
					break;
				}
				else if(arr1[i]<sum)
				{
					try {
				arr1[i]=arr1[i]+arr[j+1];
					}
					catch (Exception e) 
					{
						
					}
				}
				else if(arr1[i]>41)
				{
					i=j+1;
				}
				
			}
		}
	}

}
