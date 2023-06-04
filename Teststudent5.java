//import java.lang.String;
class Student{
int rollno;
String name;
void insert(int r,String n){
rollno=r;
name=n;
}
void displayinfo(){
System.out.println(rollno+""+name);}
}
class Teststudent5{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.insert(222,"seenu");
s2.insert(333,"srI");
s1.displayinfo();
s2.displayinfo();
}
}