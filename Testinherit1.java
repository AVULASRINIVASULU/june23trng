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
class Testinherit1
{
public static void main(String args[])
{
Dog  d=new Dog();
d.animal();
d.bark();
}
}