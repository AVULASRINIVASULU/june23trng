class First2
{
Thread t;
First2()
{
t=new Thread(this,"NEW");
System.out.println("child:"+t);
t.start();
}

public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("child:"+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("exiting child");
}
}
}
class Second
{
public static void main(String args[])throws Exception
{
new First2();
try
{
for(int i=5;i>0;i--)
{
System.out.println("MAIN"+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
}
System.out.println("exiting main");
}
}