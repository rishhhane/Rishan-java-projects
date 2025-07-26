import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        String ch = scanner.next(); 
        ch=ch.toLowerCase();
        switch (ch.charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("It is a vowel.");
                    break;
                default:
                    System.out.println("It is a consonant.");
            }
        scanner.close();
    }
}