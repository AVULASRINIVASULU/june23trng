import java.util.Scanner;
class Months
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
switch(dn)
{
case 0:System.out.println("jan");break;
case 1:System.out.println("feb");break;
case 2:System.out.println("mar");break;
case 3:System.out.println("apr");break;
case 4:System.out.println("may");break;
case 5:System.out.println("jun");break;
case 6:System.out.println("jul");break;
case 7:System.out.println("aug");break;
case 8:System.out.println("Sep");break;
case 9:System.out.println("oct");break;
case 10:System.out.println("nov");break;
case 11:System.out.println("dec");break;
default:System.out.println("INVALID");
}
}
}