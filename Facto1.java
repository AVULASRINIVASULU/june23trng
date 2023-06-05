import java.util.Scanner;
public class  FactorialD5
{
public static void main(String[] args)
{
int fact=1;
int k;
Scanner sc=new Scanner(System.in);
k=sc.nextInt();
for(int i=1;i<=k;i++)
{
fact*=i;
}
System.out.println("Fact:"+fact);
}
}