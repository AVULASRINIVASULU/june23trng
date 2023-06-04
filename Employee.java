class Employee
{
int id;
String name;
float salary;
void insert(int i,String n,float s)
{
id=i;
name=n;
salary=s;
}
void display()
{
System.out.println(id+""+name+""+salary);
}
}
public class TestStudent8
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(100,"seenu",105);
e1.insert(200,"cnu",250);
e3.insert(300,"sree",360);
e1.display();
e2.display();
e3.display();
}
}