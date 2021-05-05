import java.util.*;
class LeapYear{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        boolean leap=true;
        if(year>=1000 && year<=9999){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    leap=true;
                }
                else{
                    leap=false;
                }
            }
            else{
                leap=true;
            }
        }
        else{
            leap=false;
        }
        
        if(leap){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        }
        else{
            System.out.println("Invalid Year");
        }
        
    }
}