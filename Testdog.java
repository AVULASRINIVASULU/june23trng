class Animal{  
void move()
{
System.out.println("animal can mve");
}  
}  
class Dog extends Animal{  
void move()
{
System.out.println("dog can walk and run...");
}  
}
class Testdog
{
public static void main(String args[])
{
Animal a=new Animal();
Animal b=new Dog();
a.move();
b.move();
}
}  