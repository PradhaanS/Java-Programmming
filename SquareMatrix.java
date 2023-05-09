package is111;
import java.util.*;
//to accept "n" and calculate  the total number of all possible squares in n*n square matrix
public class sq_mat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of square matrix: ");
		int n=sc.nextInt();
		int sum=0;
		if(n!=0)
		{
			sum=n*(n+1)*(2*n+1)/6;
			System.out.println("TOTAL NUMBER OF SQUARES IS " + sum);
		}
		else
		{
			System.out.println("INVALID INPUT!!!!");
		}
	}

}
