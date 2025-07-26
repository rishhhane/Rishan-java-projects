import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println("Number found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
}

