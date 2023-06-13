class Exception2
{
public static void main(String args[])
{
try
{
int data=100/0;
String p=null;
System.out.println(p.length());
//String p="abc";
}
catch(NullPointerException e)
{
System.out.println(e);
}
System.out.println("rest of code");
}
}