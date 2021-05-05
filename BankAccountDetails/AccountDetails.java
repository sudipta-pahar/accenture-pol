import java.util.*;
public class AccountDetails{
    public static Account getAccountDetails(){
        Scanner sc=new Scanner(System.in);
        Account obj=new Account();
        
        System.out.println("Enter account id:");
        int id=sc.nextInt();
        obj.setAccountId(id);
        System.out.println("Enter account type:");
        String type=sc.next();
        obj.setAccountType(type);
        int bal;
        do{
            System.out.println("Enter balance:");
       
            bal=sc.nextInt();
            if(bal>0){
                obj.setBalance(bal);
            }
            else{
                System.out.println("Balance should be positive");
            }
        }while(bal<=0);
        return obj;
    }
    public static int getWithdrawAmount(){
        Scanner sc1= new Scanner(System.in);
        int out;
        do{
            System.out.println("Enter amount to be withdrawn:");
            out = sc1.nextInt();
            if(out>0){
            }
            else{
                System.out.println("Amount should be positive");
            }
        }while(out<=0);
        return out;
    }
    public static void main (String[] args) {
        Account obj2=new Account();
        obj2=getAccountDetails();
        int c= getWithdrawAmount();
        obj2.withdraw(c);
    }
}