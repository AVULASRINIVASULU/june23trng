import java.util.*;
class Polyex
{
void print()
{
System.out.println("welcome");
}
void print(String n)
{
System.out.println("welcome"+n);
}
}
class Polyex1
{
public static void main(String args[])
{
Polyex p1=new Polyex();
p1.print();
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String s=sc.next();
p1.print(s);
}
}