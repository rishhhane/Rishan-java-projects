import java.util.Vector;
public class fruits{
    public static void main(String[] args) {
        // Create a Vector to store fruit names
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Fruits in the vector:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
