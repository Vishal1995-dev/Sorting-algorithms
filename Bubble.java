import java.util.*;
import java.lang.*;

class bubble
{
	public void Sort(int arr[])
	{
		int i=0,j=0,temp=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}

class demo1
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
		bubble bobj=new bubble();
		bobj.Sort(arr);
		System.out.println("Sorted array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
