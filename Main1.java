import java.util.*;
class AgeDoessNotFitException extends Exception
{
String msg;
void AgeDoesNotFitException(String msg)
{
super(msg);
this.msg=msg;
}
public String toString()
{
return msg;
}
}
class Main1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try
{
if(age<18)
{
throw new AgeDoessNotFitException("Entered age does not exist");
}
}
catch(AgeDoessNotFitException ex)
{
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}