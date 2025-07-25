import java.util.Scanner;
public class studentclassdemo{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SampleData student = new SampleData();
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        student.setName(name);
        System.out.print("Enter student's age: ");
        int age = sc.nextInt();
        student.setAge(age);
        System.out.println("\nStudent Data");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        sc.close();
    }
}