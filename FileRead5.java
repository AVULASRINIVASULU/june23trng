import java.io.*;
class FileRead5{
public static void main(String args[]) throws Exception{
FileReader fr=new FileReader("D:\\507\\e.txt");      
BufferedReader br=new BufferedReader(fr);
int i;
int countVowel=0;
while((i=br.read())!=-1)
{
if(((char)i>='0')&&((char)i<='9'))
countVowel++;
}
System.out.println(countVowel);
br.close();
fr.close();
}
}