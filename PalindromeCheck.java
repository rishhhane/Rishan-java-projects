import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int p = num;
        int q = 0;
        while (num > 0) {
            int digit = num % 10;
            q = q * 10 + digit;
            num = num / 10;
        }
        if (p == q) {
            System.out.println(p + " is a palindrome.");
        } else {
            System.out.println(p + " is not a palindrome.");
        }
        sc.close();
    }
}
