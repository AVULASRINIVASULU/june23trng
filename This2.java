class A
{
void m()
{
System.out.println("hello m");
}
void n()
{
System.out.println("hello n");
this.m();
}
}
class This2
{
public static void main(String args[])
{
A q=new A();
q.n();
}
}