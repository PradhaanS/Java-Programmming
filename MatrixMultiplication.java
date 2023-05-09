ackage is111;
import java.util.*;
public class mat_mul
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//matrix 1 intialization
		System.out.println("Enter row size of 1st matrix: ");
		int r1=sc.nextInt();
		System.out.println("Enter column size of 1st matrix: ");
		int c1=sc.nextInt();
		int m1[][]=new int[r1][c1];
		int i,j;
		System.out.println("Enter the matrix elements");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		//matrix 2 intiaization
		System.out.println("Enter row size of 2nd matrix: ");
		int r2=sc.nextInt();
		System.out.println("Enter column size of 2nd matrix: ");
		int c2=sc.nextInt();
		int m2[][]=new int[r2][c2];
		System.out.println("Enter the matrix elements");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		//multiplication of matrices
		int k;
		if(c1==r2)
		{
			int s[][]=new int [r1][c2];
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					s[i][j]=0;
					for(k=0;k<c1;k++)
					{
						s[i][j]+=m1[i][k]*m2[k][j];
					}
				}
			}
			System.out.println("Answer: ");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(s[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("CANT MULTIPLY!!!! ");
		}
		
	}
}
