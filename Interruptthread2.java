class Interruptthread2 extends Thread
{
public void run()
{
try{
Thread.sleep(1000);
System.out.println("task");
}
catch(InterruptedException e)
{
System.out.println("Exception handled"+e);
}
System.out.println("thread is running");
}
public static void main(String args[])
{
Interruptthread2 t=new Interruptthread2();
t.start();
t.interrupt();
}
}