class Mythread extends Thread
{
public void run()
{
System.out.println("shutdown hook task cmpltd");
}
}
class Testshutdown1
{
public static void main(String args[])
{
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new Mythread());
System.out.println("now main sleeping press ctrl+c to exit");
try
{
Thread.sleep(3000);
}
catch(Exception e)
{
}
}
}