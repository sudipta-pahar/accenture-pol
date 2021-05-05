import java.util.*;
class Gain{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of old scooter:");
        int price = sc.nextInt();
        System.out.println("The amount spent for repair:");
        int repair = sc.nextInt();
        System.out.println("Sold Price:");
        int sold = sc.nextInt();
        if(price>0 && sold>0 && repair>=0){
            if((price+repair)<=sold){
                double percent=0;
                double l=0;
                l = sold-(price+repair);
                percent=(l*100)/(price+repair);
                System.out.printf("Gain percentage is %.2f",percent);
            }
            else{
                System.out.println("Unable to calculate Gain Percentage");
            }
            
        }
        if(price<=0 || sold<=0 || repair<0 ){
            System.out.println("Incorrect Inputs");
        }
    }
}