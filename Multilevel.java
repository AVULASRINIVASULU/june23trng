class Inheritance2
{
void animal()
{
System.out.println("eating");
}
}
class Dog extends Inheritance2
{
void bark()
{
System.out.println("barking");
}
}
class Babydog extends Dog
{
void weep()
{
System.out.println("weeping");
}
}
class multilevel
{
public static void main(String args[])
{
Babydog b=new Babydog();
b.weep();
b.bark();
b.animal();
}
}