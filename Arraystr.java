import java.util.*;
class Arraystr
{
public static void main(String args[])
{
ArrayList<String>animals=new ArrayList<>();
animals.add("dhunapothu");
animals.add("pandhi");
animals.add("kothi");
System.out.println("arraylist:"+animals);
String str=animals.get(1);
System.out.println("element at 1:"+str);
str=animals.get(2);
System.out.println("element at 2:"+str);
}
}