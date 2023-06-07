class Employee
{
float salary=40000;
}
class Programmer extends Employee
{
int bonus=10000;
public static void main(String args[])
{
Programmer i=new Programmer();
System.out.println("salary:"+i.salary);
System.out.println("bonus:"+i.bonus);
}
}
