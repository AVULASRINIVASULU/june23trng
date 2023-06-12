import java.util.*;
class Pattern1234comma
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number;
int n=sc.nextInt();
System.out.println("0");
for(int i=0;i<n;i++)
{
number=1;
for(int j=0;j<=i;j++)
{
System.out.print(number+",");
number++;
}
System.out.println();
}
}
}