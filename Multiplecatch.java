class Multiplecatch
{
public static void main(String args[])
{
try
{
int a[]=new int[5];
a[5]=40/0;
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