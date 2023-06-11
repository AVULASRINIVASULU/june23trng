abstract class Bike{
abstract void run();
}
class R15 extends Bike{
void run()
{
System.out.println("running safely");
}
public static void main(String args[])
{
Bike obj=new R15();
obj.run();
}
}