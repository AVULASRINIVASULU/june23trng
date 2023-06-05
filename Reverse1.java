import java.util.*;
public class Reverse1   
{  
public static void main(String[] args)   
{
Scanner sc=new Scanner(System.in);  
int number =sc.nextInt();
rev = 0;//987654,rev=0  
while(number != 0)   
{  
int remainder = number % 10;  
rev = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + rev);  
}  
}