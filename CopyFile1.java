import java.io.*;
import java.io.FileWriter;
class CopyFile1{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("D:\\507\\e.txt");
BufferedReader br=new BufferedReader(fr);
CharArrayWriter out=new CharArrayWriter();
int i;
while((i=br.read())!=-1){
out.write((char)i);
}
FileWriter f1=new FileWriter("D:\\507\\a.txt");
out.writeTo(f1);
f1.close();
System.out.println("Success..");
}
}