import java.util.*;
public class Even3
{
public static boolean isEven(int n)
{
return ((n/2)*2==n);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number");
n=sc.nextInt();
if(n/2*2==n)
System.out.println("Even");
else
System.out.println("not even");
}
}