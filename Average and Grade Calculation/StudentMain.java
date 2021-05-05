import java.util.*;

public class StudentMain{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the no of subjects:");
        int count=sc.nextInt();
        
        int a[] = new int[count];
        int pr=1;
        
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter mark for subject "+(pr++)+":");
            a[i]=sc.nextInt();
        }
        Student s = new Student(id,name,a);
        System.out.println("Id:"+s.getId());
        System.out.println("Name:"+s.getName());
        s.calculateAvg();
        s.findGrade();
        System.out.println("Average:"+String.format("%.2f",s.getAverage()));
        System.out.println("Grade:"+s.getGrade());
        
    }
}