package is111;
import java.util.*;
public class sort_alphabets
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 alphabets: ");
		String[] x = new String[5];
		x[0]=sc.next();
		x[1]=sc.next();
		x[2]=sc.next();
		x[3]=sc.next();
		x[4]=sc.next();
		System.out.println("Unsorted Array: ");
		for(int i=0;i<5;i++)
		{
			
			System.out.print(x[i]+" ");
		}
		System.out.println();
		Arrays.sort(x);
		System.out.println("Sorted Array: ");
		for(int i=0;i<5;i++)
		{
			System.out.print(x[i]+" ");
		}
	}
}
