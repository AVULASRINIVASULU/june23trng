import java.io.*;
public class Trycatchfile
{
public static void main(String args[])
{
PrintWriter pw;
try
{
pw=new PrintWriter("jtp.txt");
pw.println("saved");
}
catch (FileNotFoundException e)
{
System.out.println(e);
}
System.out.println("file saved succesfully");
}
}