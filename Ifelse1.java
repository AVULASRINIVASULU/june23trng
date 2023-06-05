import java.util.*;
class Ifelse1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
i=sc.nextInt();
j=sc.nextInt();
if(j==0)
System.out.println("Zero div error");
else
System.out.println(i+"divided by"+j+"is"+(i/j));
}
}