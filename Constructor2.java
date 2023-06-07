class Constructor2
{
int id;
String name;
int age;
Constructor2(int i,String n)
{
id=i;
name=n;
}
Constructor2(int i,String n,int a)
{
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+""+name+""+age);
}
public static void main(String args[])
{
Constructor2 c=new Constructor2(111,"seenu");
Constructor2 c2=new Constructor2(222,"sree");
c.display();
c2.display();
}
}