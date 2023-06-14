class Testinterrupting extends Thread
{
public void run()
{
try
{
Thread.sleep(100);
System.out.println("task");
}
catch(InterruptedException e)
{
throw new RuntimeException("Thread interrupted");
}
}
public static void main(String args[]) 
{
Testinterrupting  t1=new Testinterrupting();
t1.start();
try
{
t1.interrupt();
}
catch(Exception e)
{
System.out.println("exception handled..");
}
}
}