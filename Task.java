class Task extends Thread
{
String threadname;
public Task(String name)
{
threadname=name;
}
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println(threadname+"is Daemon Thread");
}
else
{
System.out.println(threadname+"is user thread");
}
}
public static void main(String args[])
{
Task thread1=new Task("thread1");
Task thread2=new Task("thread2");
thread1.setDaemon(true);
thread1.start();
thread2.start();
}
}