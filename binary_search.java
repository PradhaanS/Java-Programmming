package is111;
import java.util.*;
public class binarysearch
{
	public static void binary(int arr[],int first,int last,int key)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("After sorting, element is found at index:" +mid);
				break;
			}
			else
			{
				last=mid+1;
			}
			mid=(first+last)/2;
		}
		if(last<first)
		{
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter an array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the element you want to find: ");
		int key=sc.nextInt();
		int last=n-1;
		binary(arr,0,last,key);
	}

}
