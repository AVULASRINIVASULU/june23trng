class TestDeadlockExample1{
public static void main(String args[]){
final String resource1="ratan jai";
final String resource2="ratan jai";
Thread t1=new Thread(){
public void run(){
synchronized(resource1){
System.out.println("Thread1:resource 1");
try{
Thread.sleep(100);}catch(Exception e){}
synchronized(resource2){
System.out.println("Thread 1: resource2");
}
}
}
};
Thread t2=new Thread(){
public void run(){
synchronized(resource2){
System.out.println("Thread2 :resource 2");
try{
Thread.sleep(100);}catch(Exception e){}
synchronized(resource1){
System.out.println("Thread 1: resource1");
}
}
}
};
t1.start();
t2.start();
}
}