import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a,b;
        System.out.print("Enter 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        b = sc.nextInt();
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        System.out.println("GCD is: " + a);
    }
}
