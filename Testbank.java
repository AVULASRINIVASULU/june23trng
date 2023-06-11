abstract class Bank
{
abstract int getrateofinterest();
}
class SBI extends Bank
{
int getrateofinterest()
{
return 7;
}
}
class PNB extends Bank{
int getrateofinterest()
{
return 8;
}
}
class Testbank
{
public static void main(String args[])
{
Bank b=new SBI();
System.out.println("rate of interest is:"+b.getrateofinterest()+"%");
b=new PNB();
System.out.println("rate of interest is:"+b.getrateofinterest()+"%");}
}