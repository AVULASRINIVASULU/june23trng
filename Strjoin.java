import java.lang.*;
public class Strjoin
{
public static void main(String args[])
{
String s1=new String("M.S.");
String s2=new String("Dhoni");
String s=String.join("#",s1,s2);
System.out.println(s.toString());
}
}