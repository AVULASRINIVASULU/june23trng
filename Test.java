class Childthread extends Thread
{
public void run()
{
for(int i=1;i<=4;i++)
{
try
{
Thread.sleep(500);
}
catch(Exception e)
{
}
System.out.println("child thread Execution"+i);
}
}
}
class Test{
public static void main(String args[])throws Exception
{
Childthread ch=new Childthread();
ch.start();
ch.join();
System.out.println("main thread cmpltd");
}
}