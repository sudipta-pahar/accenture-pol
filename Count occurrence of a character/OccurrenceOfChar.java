import java.util.*;
public class OccurrenceOfChar{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        for (int i=0; i<word.length(); i++){
            int word_check= word.charAt(i);
            if (word_check<65 || word_check>122){
                System.out.println("Not a valid string");
                System.exit(0);
            } 
        } 
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);
        int check= ch;
        if(check<65 || check>122){
            System.out.println("Given character is not an alphabet");
            System.exit(0);
        }
        int count=0;
        for (int i=0; i<word.length(); i++){
            int ascii = word.charAt(i);
                if(check==ascii){
                    count++;
                }
            
           
        } 
        if(count>0){
            System.out.println("No of '"+ch+"' present in the given word is "+count);
        }
        else{
            System.out.println("The given character '"+ch+"' not present in the given word.");
        }
        
    }
}