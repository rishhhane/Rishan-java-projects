import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    double salary;
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }
    void display(){
        System.out.println("Employee ID:"+empId);
        System.out.println("Employee Name:"+empName);
        System.out.println("Employee Salary:"+salary);
    }
}
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Employee Name:");
        String Name=sc.nextLine();
        System.out.println("Enter The Employee ID:");
        int Id=sc.nextInt();
        System.out.println("Enter The Employee Salary:");
        double sal=sc.nextDouble();
        Employee emp1 =new Employee(Id,Name,sal);
        emp1.display();
    }
}
