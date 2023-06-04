public class Digitsstr{
    public static void main(String[] args)
    {
        String str = "his birthday is 12th 5";
        int n= 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                n++;
        }
        System.out.println("Total number of Digits = "
                           +n);
    }
}