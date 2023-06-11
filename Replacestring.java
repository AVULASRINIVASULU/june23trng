import java.util.*;
class Replacestring
{
public static void main(String  args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String c=sc.next();
String r=sc.next();
String res=str.replaceAll(c,r);
System.out.println(res);
}
}
