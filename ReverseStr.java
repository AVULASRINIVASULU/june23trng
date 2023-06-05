import java.util.Scanner;
class ReverseStr
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s;
String rs="";
System.out.println("Enter the String:");
s=sc.next();
int len=s.length()-1;
for(int i=len;i>=0;i--)
{
rs=rs+s.charAt(i);
}
System.out.println(rs);
}
}