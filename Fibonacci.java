import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
System.out.println("enter n");
n=sc.nextInt();
while(sum<=n)
{
System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;
}
}
}
