import java.util.Scanner;
public class Lettercheckd4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch=sc.next().charAt(0);
int count=0;
for (int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)=='t')
{
count++;
}
}
System.out.println(count);
}}