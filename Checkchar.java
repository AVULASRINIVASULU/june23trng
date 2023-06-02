import java.util.*;
public class Checkchar{
public static void main(String[] args){
int cha;
System.out.println("Enter the character:");
Scanner sc=new Scanner(System.in);
cha=sc.next().charAt(0);
System.out.println();
if((cha>='0'&&cha<='9')
System.out.println(cha+"is an digit");
else
System.out.println(cha+" is an not digit");
}
}