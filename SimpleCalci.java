package is111;
import java.util.*;
public class simple_calci
{

	public static void main(String[] args)
	{
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st opernd");
		int a=sc.nextInt();
		System.out.println("Enter 2nd opernd");
		int b=sc.nextInt();
		System.out.println("Enter operator");
		char c=sc.next().charAt(0);
		switch(c)
		{
			case '+': result=a+b;
			System.out.println("result = " +result);
			break;
			case '-': result=a-b;
			System.out.println("result = " +result);
			break;
			case '*': result=a*b;
			System.out.println("result = " +result);
			break;
			case '/': result=a/b;
			System.out.println("result = " +result);
			break;
			default:System.out.println("INVALID CHOICE!!!!");
		}
	}
}
