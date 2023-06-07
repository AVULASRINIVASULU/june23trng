import java.util.*;
class Stringlower
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String res="";
int ascii;
for(int i=s.length()-1;i>=0;i--)
{
if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
{
ascii=s.charAt(i);
ascii+=32;
res=res+(char)ascii;
}
else
{
res=res+s.charAt(i);
}
}
System.out.println(res);
s=res;
String temp="";
for(int i=s.length()-1;i>=0;i--)
{
temp=temp+s.charAt(i);
}
if(s.equals(temp))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
