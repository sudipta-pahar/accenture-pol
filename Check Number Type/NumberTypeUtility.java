import java.util.*;
public class NumberTypeUtility
{
   public static NumberType isOdd(){
       NumberType check =(number)->number%2!=0;
       
       return check;
   }
   public static void main (String[] args) {
       /* code */
       Scanner sc = new Scanner(System.in);
       NumberType nt= NumberTypeUtility.isOdd();
       int n= sc.nextInt();
       if(nt.checkNumberType(n)){
           System.out.println(n+" is odd");
       }
       else{
           System.out.println(n+" is not odd");
       }
           
   }
}