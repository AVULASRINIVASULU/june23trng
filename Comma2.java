import java.util.*;
class Comma2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int count;
int i=sc.nextInt();//i=10
count=sc.nextInt();//count=1
while(count<=i){
System.out.print(count);
count=count+1;
if(i>=count) {System.out.print(",");}
}
}}