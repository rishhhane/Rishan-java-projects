import java.util.Scanner;
class Radii{
    double radius;
    Radii(double r){
        radius=r;
    }
    void display(){
        System.out.println("Area="+(Math.PI*radius*radius));
        System.out.println("Circumferance="+(2*Math.PI*radius));
    }

}
public class Task2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr the Radius:");
    double radi=sc.nextDouble();
    Radii radii1=new Radii(radi);
    radii1.display();
    sc.close();
    }
}
