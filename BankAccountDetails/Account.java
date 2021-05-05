public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    
    public void setAccountId(int accountId){
        this.accountId=accountId;
    }
    public int getAccountId(){
        return accountId;
    }
    
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public String getAccountType(){
        return accountType;
    }
    
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
    public boolean withdraw(int withdraw){
        if(getBalance()>withdraw){
            int out = getBalance() - withdraw;
            System.out.println("Balance amount after withdraw: "+out);
            return true;
        }
        else{
            System.out.println("Sorry!!! No enough balance");
            return false;
        } 
    }
}