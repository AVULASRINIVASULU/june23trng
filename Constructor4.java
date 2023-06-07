class Constructor4
{
int id;
String name;
int age;
Constructor4(int i,String n)
{
id=i;
name=n;
}
Constructor4(int i,String n,int a)
{
id=i;
name=n;
}
Constructor4()
{
}void display()
{
System.out.println(id+""+name);
}
public static void main(String args[]){
Constructor4 c1=new Constructor4(111,"seenu");
Constructor4 c2=new Constructor4();
c2.id=c1.id;
c2.name=c1.name;
c1.display();
c2.display();
}
}