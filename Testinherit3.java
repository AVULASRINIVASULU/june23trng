class C
{
public void disp()
{
System.out.println("method of c");
}
}
class A extends C
{
public void disp()
{
System.out.println("method of class a");
}
}
class B extends C
{
public void disp()
{
System.out.println("inside class b");
}
}
class D extends A
{
public void disp()
{
System.out.println("inside d");
}
public static void main(String args[])
{
D d1=new D();
d1.disp();
}
}