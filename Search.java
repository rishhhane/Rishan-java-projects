import java.util.Scanner;
import java.util.Vector;

public class Search {
    public static void main(String[] args) {
        // Create and initialize the vector
        Vector<String> items = new Vector<>();
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        // Ask user for input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an item to search: ");
        String input = sc.nextLine();

        // Check if the item exists (case-sensitive)
        if (items.contains(input)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        sc.close();
    }
}

