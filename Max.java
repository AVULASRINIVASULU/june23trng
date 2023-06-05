import java.util.*;
class Max
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,max;
i=sc.nextInt();
j=sc.nextInt();
max=sc.nextInt();
if(i<j)
{
max=i;
}
else
{
max=j;
}
System.out.println("min:"+max);
}
}