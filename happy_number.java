package is111;
import java.util.*;
interface yes{
int checkHappyNumber(int number);
}
class Happy implements yes {
public int checkHappyNumber(int number)
{
int rem = 0, sum = 0;
while(number > 0)
{
rem = number %10;
sum = sum+(rem*rem);
number = number/10;
}
return sum;
}
}
public class happynumber{
public static void main(String[] args)
{
Happy ob=new Happy();
Scanner sc = new Scanner (System.in);
System.out.print("Enter a non-zero Positive Number:");
int number = sc.nextInt( );
int result = number;
while (result != 1 && result != 4)
{
result = ob.checkHappyNumber(result);
}
if (result ==1)
{
System.out.println ("It is a Happy Number");
}
else
{
System.out.println (" It is not a Happy Number");
}
}
}
