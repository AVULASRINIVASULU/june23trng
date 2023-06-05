import java.util.*;
class Reversing
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int sd=0;
System.out.println("Enter any positive integer:");
n=sc.nextInt();
while(n>0){
sd=sd*10+(n%10);
n=n/10;
}
System.out.println(sd);
}
if()
{
System.out.println("Given number is the pali");
}
else
{
System.out.println("not a pali");
}
}
}