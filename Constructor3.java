class Constructor3
{
int id;
String name;
int age;
Constructor3(int i,String n)
{
id=i;
name=n;
}
Constructor3(int i,String n,int a)
{
id=i;
name=n;
}
Constructor3(Constructor3 s)
{
id=s.id;
name=s.name;
}
void display()
{
System.out.println(id+""+name);
}
public static void main(String args[])
{
Constructor3 c1=new Constructor3(111,"seenu");
Constructor3 c2=new Constructor3(c1);
c1.display();
c2.display();
}
}