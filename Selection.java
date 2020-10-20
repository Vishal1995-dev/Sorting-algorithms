import java.util.*;
import java.lang.*;

class Select
{
	public void Sort(int arr[])
	{
		int pass=0,j=0,temp=0,min_i=0;
		for(pass=0;pass<arr.length;pass++)
		{
			min_i=pass;
			for(j=pass+1;j<arr.length;j++)
			{
				if(arr[min_i]>arr[j])
				{
					min_i=j;
				}
			}
			temp=arr[pass];
			arr[pass]=arr[min_i];
			arr[min_i]=temp;
		}
	}
}

class Selection
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
		Select bobj=new Select();
		bobj.Sort(arr);
		System.out.println("Sorted array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
