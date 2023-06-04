class Employee{
int id;
String name;
float salary;
void insert(int i,String n,float s)
{
id=i;
name=n;
salary=s;}
void display(){
System.out.println(id+" "+name+" "+salary);
}}
public class TestEmployee
{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(526,"santhu",1000);
e2.insert(537,"prasad",1001);
e3.insert(539,"satheesh",1002);
e1.display();
e2.display();
e3.display();
}
}