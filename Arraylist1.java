import java.util.*;
class Arraylist1
{
public static void main(String args[])
{
List<Integer>marks=new ArrayList<>();
marks.add(17);
marks.add(34);
marks.add(56);
System.out.println("list:"+marks);
int mark=marks.get(2);
System.out.println("accessed element:"+marks);
int removednumber=marks.remove(1);
System.out.println("removed element:"+removednumber);
System.out.println("list:"+marks);
}
}
