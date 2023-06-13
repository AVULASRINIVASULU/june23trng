import java.util.*;
class Marks
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter roll no:");
int rollno=sc.nextInt();
System.out.println("Enter name:");
String s=sc.next();
System.out.println("enter the marks:");
int marks=sc.nextInt();
if(marks<34)
{
System.out.println("fail");
}
else
{
System.out.println("pass");
}
if(marks==34)
{
System.out.println("Marginal pass");
}
}
}
