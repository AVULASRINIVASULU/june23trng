public class Concatex1
{
public static void main(String args[])
{
String s="Hello";
String s2="java";
String s3="reader";
String s4=s.concat("").concat(s2).concat(s3);
System.out.println(s4);
String s5=s.concat("!!");
System.out.println(s5);
String s6=s.concat("@@@").concat(s2);
System.out.println(s6);
}
}
