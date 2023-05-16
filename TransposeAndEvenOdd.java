package is111;

import java.util.*;

public class matrix
{
	public void transpose()
	{
		//To take matrix input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size: ");
		int r=sc.nextInt();
		System.out.println("Enter column size: ");
		int c=sc.nextInt();
		int m[][]=new int[r][c];
		int i,j;
		System.out.println("Enter the matrix elements");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		
		//To find transpose of matrix
		int t[][]=new int[c][r];
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
			{
				t[j][i]=m[i][j];
			}
		
		//To print original matrix
		System.out.println("Original Matrix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		//To print transpose of matrix
		System.out.println("Transpose Matrix: ");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) //Main function
	{
		even_odd k=new even_odd();
		k.transpose();
	}
}
class even_odd extends matrix
{
	public void transpose() //using override
	{
		super.transpose();
		int a[]= {1,2,3,4,5,6};
		System.out.println("Odd terms of the array: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0) //To check if element is odd
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Even terms of the array: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) //To check if element is even
			{
				System.out.println(a[i]);
			}
		}	
	}
}
