import java.util.*;
import java.lang.*;

class Sorting
{
	public void Sort(int arr[])
	{
		int pass=0,key=0;
		for(pass=1;pass<arr.length;pass++)
		{
			key=arr[pass];
			int j=pass-1;
			while((j>=0) && (arr[j]>key))
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}

class insertion
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sobj.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the values:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}	
		Sorting bobj=new Sorting();
		bobj.Sort(arr);
		System.out.println("Sorted array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
