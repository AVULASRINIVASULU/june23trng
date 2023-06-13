class Multiplecatch2
{
public static void main(String args[])
{
try
{
String s=null;
System.out.println(s.length());
}
catch(ArithmeticException e)
{
System.out.println("ae ocurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("a0 occurs");
}
catch(Exception e)
{
System.out.println("rest of ocurs");
}
}
}