class Student{
int rollno;
String name;
Student()
{
rollno=0;
name=null;
}
Student(int r,String n){
rollno=r;
name=n;
}
void displayinfo(){
System.out.println(rollno+" "+name);
}
}
class Teststudent7{
public static void main(String args[]){
Student s1;
s1=new Student();
Student s2=new Student(11,"seenu");
s1.displayinfo();
s2.displayinfo();
}
}