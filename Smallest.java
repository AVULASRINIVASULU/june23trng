import java.util.*;
public class Smallest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int k=sc.nextInt();
if(j<k)
{
System.out.print(i);}
else if(i<-j)
{
System.out.print(j);
}
else{
System.out.print(k);}
}
}
