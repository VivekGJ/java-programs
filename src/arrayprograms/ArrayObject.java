package arrayprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayObject 
{
	public static void main(String[] args) 
	{
		Object[] arr= new Object[5];
		arr[0]="ertjj";
		arr[1]='t';
		arr[2]=52;
		arr[3]=5.2;
		arr[4]=true;
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
