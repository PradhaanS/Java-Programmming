package is111;

import java.util.*;
import java.io.*;
interface one{
void sum(int a,int b);
}
interface two{
void difference(int a,int b);
}
class ABC implements one,two{
public void sum(int a,int b) {
int sum=a+b;
System.out.println("sum of"+a+"and"+b+"is:"+sum);
}
public void difference(int a,int b) {
int difference=a-b;
System.out.println("Difference of"+a+"and"+b+"is:"+difference);
}
}
class multipleinheritance{
public static void main(String []args) {
ABC obj=new ABC();
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("enter the values of a and b:");
a=s.nextInt();
b=s.nextInt();
obj.sum(a,b);
obj.difference(a,b);
}
}
