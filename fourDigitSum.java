import java.util.Scanner;

public class fourDigitSum {
    public static void main(String[] args) {
        int q=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt(); 
        while (n!=0){
            q+=(n%10);
            n = n/10;
        }
        System.out.println("final sum"+q);
        sc.close();
    }
}