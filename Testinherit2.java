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
class Babycat extends Inheritance2
{
void cat()
{
System.out.println("weeping");
}
}
class Testinherit2
{
public static void main(String args[])
{
Babycat b1=new Babycat();
b1.cat();
b1.animal();
Dog d=new  Dog();
d.bark();
d.animal();
}
}