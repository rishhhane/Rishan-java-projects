import java.util.Vector;
public class MaxInVector {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value in the vector: " + max);
    }
}

