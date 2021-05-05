import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name1 = sc.nextLine();
        System.out.println("Enter the panno:");
        String panno1= sc.nextLine();
        System.out.println("Enter the emailid:");
        String emailid1 = sc.nextLine();
        System.out.println("Enter the salary:");
        int salary1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name2= sc.nextLine();
        System.out.println("Enter the panno:");
        String panno2= sc.nextLine();
        System.out.println("Enter the emailid:");
        String emailid2= sc.nextLine();
        System.out.println("Enter the salary:");
        int salary2= sc.nextInt();
        Customer cc1= new Customer(name1, panno1, emailid1, salary1);
        Customer cc2= new Customer(name2, panno2, emailid2, salary2);
        boolean bool = cc1.equals(cc2);
        if(bool){
            System.out.println("Both the objects are equal.");
        }
        else{
            System.out.println("Both the objects are not equal.");
        }
    }
}