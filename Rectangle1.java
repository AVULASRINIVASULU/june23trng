class Rectangle
{
int width,length;
void insert(int l, int w)
{
length=l;
width=w;
}
void calarea()
{
System.out.println(length*width);
}
}
class Rectangle1
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(11,6);
r2.insert(20,4);
r1.calarea();
r2.calarea();
}
}