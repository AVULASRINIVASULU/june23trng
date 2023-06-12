import java.io.CharArrayReader;
class Chararray
{
public static void main(String args[])throws Exception
{
char[] arr={'j','a','v','a','t','p','o','i','n','t'};
CharArrayReader r=new CharArrayReader(arr);
int k=0;
while((k=r.read())!=-1)
{
char ch=(char)k;
System.out.print(ch+":");
System.out.println(k);
}
}
}