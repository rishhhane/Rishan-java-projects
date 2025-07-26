import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int op;
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the Operation:");
        char ch=sc.next().charAt(0);
        switch (ch){
            case '+':
            op=a + b;
            break;
            case '-':
            op=a - b;
            break;
            case '*':
            op=a * b;
            break;
            case '/':
            op=a / b;
            break;
            default:
               System.out.println("Invalid Input");
               return;
         }
         System.out.println("Answer="+op);
         sc.close();
        }
    }