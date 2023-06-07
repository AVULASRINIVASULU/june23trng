public class PalindromeNumbers {
    public static void main(String[] args) {
        int num;
        for (int i = 1; i <= 1000; i++) {
            num = i;
            int rev = 0;
            while (num != 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }
            if (i == rev) {
                System.out.print(i + " ");
            }
        }
    }
}
