import java.util.Scanner;
class Bank{
    int Acno;
    String Acholder;
    double Acbalance=0;
    Bank(int no,String holder,double bal){
        Acno=no;
        Acholder=holder;
        Acbalance=bal;
    }
    void deposite(int amt){
        Acbalance=Acbalance+amt;
        System.out.println("Amount deposited successfully.");
    }
    void display(){
        System.out.println("-----------------");
        System.out.println("Account No:"+Acno);
        System.out.println("Acoount Holder:"+Acholder);
        System.out.println("Account Balance:"+Acbalance);
        System.out.println("-----------------");
    }
}
public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Acoount Holder:");
        String Aho=sc.nextLine();
        System.out.println("Account No:");
        int Ano=sc.nextInt();
        System.out.println("Account Balance:");
        double Abnc=sc.nextDouble();
        Bank CBank1=new Bank(Ano,Aho,Abnc);
        CBank1.display();
        System.out.println("Add Money:");
        int amt=sc.nextInt();
        CBank1.deposite(amt);
        CBank1.display();
        sc.close();
    }
}
