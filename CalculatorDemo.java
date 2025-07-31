import java.util.Scanner;
class MyCalculator {
    double number1, number2;
    MyCalculator(double n1, double n2) {
        number1 = n1;
        number2 = n2;
    }

    double add() {
        return number1 + number2;
    }

    double subtract() {
        return number1 - number2;
    }

    double multiply() {
        return number1 * number2;
    }

    double divide() {
        if (number2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0.0;
        } else {
            return number1 / number2;
        }
    }
}


public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            System.out.print("Enter two numbers: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            MyCalculator calc = new MyCalculator(num1, num2);

            switch (option) {
                case 1:
                    System.out.println("Result: " + calc.add());
                    break;
                case 2:
                    System.out.println("Result: " + calc.subtract());
                    break;
                case 3:
                    System.out.println("Result: " + calc.multiply());
                    break;
                case 4:
                    System.out.println("Result: " + calc.divide());
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');
        sc.close();
    }
}
