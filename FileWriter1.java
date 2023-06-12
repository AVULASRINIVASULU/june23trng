import java.io.CharArrayWriter;
import java.io.FileWriter;

class FileWriter1{
public static void main(String args[])throws Exception{
CharArrayWriter out=new CharArrayWriter();
out.write("Welcome to this java");
FileWriter f1=new FileWriter("D:\\507\\b.txt");
FileWriter f2=new FileWriter("D:\\507\\a.txt");
FileWriter f3=new FileWriter("D:\\507\\.txt");
FileWriter f4=new FileWriter("D:\\507\\d.txt");
out.writeTo(f1);
out.writeTo(f2);
out.writeTo(f3);
out.writeTo(f4);
f2.close();
f1.close();
f3.close();
f4.close();
System.out.println("Sucess...");
}
}