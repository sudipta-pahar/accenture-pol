import java.util.*;
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer id:");
        int id= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter customer name:");
        String name = sc.nextLine();
        System.out.println("Enter email id:");
        String email = sc.next();
        sc.nextLine();
        Customer cc = new Customer(id, name, email);
        System.out.println("Enter account number:");
        int number = sc.nextInt();
        System.out.println("Enter balance:");
        double balance = sc.nextDouble();
        //Account a= new Account(number, cc, balance);
        System.out.println("Enter minimum balance:");
        double minimum= sc.nextDouble();
        SavingsAccount ss= new SavingsAccount(number, cc, balance, minimum);
        System.out.println("Enter withdraw amount:");
        double withdrawamount= sc.nextDouble();
        if(ss.withdraw(withdrawamount)){
            System.out.println("Amount withdrawn");
        }
        else{
            System.out.println("Error");
        }
        
    }
}