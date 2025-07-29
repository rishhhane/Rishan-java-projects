
import java.util.Scanner;

class Book{
    String Title;
    String Author;
    int Price;
    Book(String T,String A,int P){
        Title=T;
        Author=A;
        Price=P;
    }
    void display(){
        System.out.println("Title:"+Title);
        System.out.println("Author"+Author);
        System.out.println("Price"+Price);
        System.out.println("----------------------");
    }
}
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book[] Books=new Book[2];
        for (int i = 0; i <2; i++) {
            System.out.println("Enter The Title:");
            String TBook=sc.nextLine();
            System.out.println("Enter The Author Name:");
            String ABook=sc.nextLine();
            System.out.println("Enter The Price");
            int PBook=sc.nextInt();
            sc.nextLine();
            Books[i]=new Book(TBook,ABook,PBook);
        }
        for (int i = 0; i <2; i++) {
            Books[i].display();
        }
    }
    
}
