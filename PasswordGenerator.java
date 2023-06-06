package is111;
import java.util.*;
public class password_generator
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		String pw=new String();
		long ph;
		int rno,rem,sum=0;
		System.out.println("Enter the name: ");
		name=sc.next();
		System.out.println("Enter the rooom no. : ");
		rno=sc.nextInt();
		System.out.println("Enter the phone number: ");
		ph=sc.nextLong();
		char[]sym= {'!','@','#','$','%','^','&','*','(',')'};
		do
		{
			while(rno!=0)
			{
				rem=rno%10;
				sum=sum+rem;
				rno=rno/10;
			}
			if(sum>=10)
			{
				rno=sum;
				sum=0;
			}
		}
		while(rno!=0);
		int c=rno/100;
		int len=name.length();
		System.out.println("Password is: ");
		pw=""+name.charAt(0)+(ph%10)+sum+sym[c]+name.charAt(len-1);
		System.out.println(pw);
	}
}
