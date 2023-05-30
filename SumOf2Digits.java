package is111;

import java.util.*;

public class sum_of_2_dig 
{
	public static int calculateDigitsum(int a)
	{
		int sum=0;
		while(a >0)
		{
			sum+=a%10;
			a /=10;	
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter two digit number for the digitsum:  ");
		int a=Sc.nextInt();
		int digitsum = calculateDigitsum(a);
		while(digitsum >=10)
		{
			digitsum =calculateDigitsum(digitsum);
		}	
		System.out.println("Final digit sum is:"+digitsum);
	}
}
