class Customer
{
int amount=10000;
synchronized void withdraw(int amount)
{
System.out.println("going o with draw..");
if(this.amount<amount)
{
System.out.println("less balance:waiting for deposit....");
try
{
wait();
}
catch(Exception e)
{
}
}
this.amount-=amount;
System.out.println("withdraw cmpltd...");
}
synchronized void deposit(int amount)
{
System.out.println("g0inng to dep0sit...");
this.amount=amount;
System.out.println("deposit cmltd..");
notify();
class Atm
{
public static void main(String args[])
{
final Customer c=new Customer();
new Thread()
{
public void run()
{
c.withdraw(15000);
}
}.start();
new Thread()
{
public void run()
{
c.deposit(10000);
}
}.start();
}
}