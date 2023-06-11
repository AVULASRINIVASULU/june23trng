import java.util.Scanner;

public class Pyramidpat {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
String s="";
s=sc.next();
System.out.print("Enter the number of rows: ");
int rows = sc.nextInt();
for (int i = 1; i <= rows; i++) {
for (int j = rows; j > i; j--) {
System.out.print(" ");
 }
for (int k = 1; k <= i; k++) {
System.out.print(" "+s);
}
System.out.println();
}
}
}