class Student
{
int rollno;
String name;
static String college="MTIE";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+""+name+""+college);
}
}
public class Static1
{
public static void main(String args[])
{
Student s=new Student(111,"seenu:");
Student s1=new Student(222,"manju:");
Student.college=("am reddy");
s.display();
s1.display();
}
}

