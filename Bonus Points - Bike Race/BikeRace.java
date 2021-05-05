import java.util.*;
class BikeRace{
    public static void main (String[] args) {
        /* code */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        int distance= sc.nextInt();
        if(distance<0){
            System.out.println("Invalid input");
        }
         
        else{
            String str= distance+"";
            int length=str.length();
            int even=1;
            int odd=1;
            int arr[]= new int[length];
            for (int i=0;i<length ;i++ ){
                arr[i]=Integer.parseInt(str.charAt(i)+"");
                if(i%2==0){
                    even=even*arr[i];
                }
                else{
                    odd=odd*arr[i];
                }
            }
            if(even>odd){
                System.out.println("Your bonus points is "+even);
            }
            else if (odd<even){
                System.out.println("Your bonus points is "+odd);
            } 
            else{
                System.out.println("Your bonus points is "+(2*even));
            }
        }
    }
}