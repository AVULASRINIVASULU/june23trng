import java.util.*;
class Commatest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=0;i<=a;a--)
{
System.out.print(a);
if(i<a)
{
System.out.print(",");
}
}
}
}