import java.util.Scanner;

public class oddloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet: ");
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
           if (i%2==0){
            continue;
           } 
           System.out.println(i);
        }
        sc.close();
    }
 }
