class Author
{
String authorname;
int age;
String place;
Author(String name,int age,String place)
{
this.authorname=authorname;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author auther;
Book(String n,int p,Author auther)
{
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String args[])
{
Author auther=new Author("seenu",45,"ind");
Book b=new Book("java for begginer",800,auther);
System.out.println("book name"+b.name);
System.out.println("book price"+b.price);
System.out.println("------Author details------");
System.out.println("Authorplace"+b.auther.place);
}
}