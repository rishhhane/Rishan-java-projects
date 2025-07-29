import java.util.Vector;

public class SumVector {
    public static void main(String[] args) {
        // Create a Vector to store integers
        Vector<Integer> numbers = new Vector<>();

        // Add numbers to the vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Calculate sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Print the result
        System.out.println("Sum of all elements: " + sum);
    }
}

