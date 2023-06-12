import java.util.*;
class Fre
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
System.out.print(i+",");
while(i>=j)
{
i-=j;
System.out.print(i+"");
if(i>=j)
{
System.out.print(",");
}
}
}
}