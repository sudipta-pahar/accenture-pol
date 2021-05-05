import java.util.*;
class SnacksDetails{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought:");
        int pizza=sc.nextInt();
        System.out.print("Enter the no of puffs bought:");
        int puff=sc.nextInt();
        System.out.print("Enter the no of cool drinks bought:");
        int cool=sc.nextInt();
        int total_pizza=pizza*100;
        int total_puff=puff*20;
        int total_cool=cool*10;
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puff);
        System.out.println("No of cooldrinks:"+cool);
        System.out.println("Total price="+(total_cool+total_puff+total_pizza));
        System.out.println("ENJOY THE SHOW!!!");
    }
}