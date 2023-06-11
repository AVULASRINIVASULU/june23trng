import java.util.*;
class Smalllarge
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
int sum=0;
int n=sc.nextInt();
int[] arr=new int[n];
for(i=1;i<=n;i++)
{
arr[i]=sc.nextInt();
Array.sort(arr);
System.out.println(arr[0]);
System.out.println(""+arr(n-1));
for(i=0;i<=arr.length();i++)
{
sum=sum+arr[i];
System.out.println(sum);
}
}
}
}
