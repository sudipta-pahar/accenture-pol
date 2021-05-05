import java.util.*;
public class Main{
       public static Hosteller hh;
       public static Hosteller getHostellerDetails(){
           Scanner sc = new Scanner(System.in);
            hh = new Hosteller();
            System.out.println("Enter the Details:");
            System.out.println("Student Id");
            hh.setStudentId(sc.nextInt());
            System.out.println("Student Name");
            sc.nextLine();
            hh.setName(sc.nextLine());
            System.out.println("Department Id");
            hh.setDepartmentId(sc.nextInt());
            System.out.println("Gender");
            sc.nextLine();
            hh.setGender(sc.nextLine());
            System.out.println("Phone Number");
            hh.setPhone(sc.next());
            System.out.println("Hostel Name");
            sc.nextLine();
       
      
           /* code */
       
            hh.setHostelName(sc.nextLine());
            System.out.println("Room Number");
            hh.setRoomNumber(sc.nextInt());
            return hh;
       }
        
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            getHostellerDetails();
        
            System.out.println("Modify Room Number(Y/N)");
            char choice= sc.next().charAt(0);
            if((choice=='Y')||(choice=='y')){
                System.out.println("New Room Number");
                hh.setRoomNumber(sc.nextInt());
                sc.nextLine();
                choice='N';
            }
            System.out.println("Modify Phone Number(Y/N)");
            choice= sc.next().charAt(0);
            if((choice=='Y')||(choice=='y')){
                 System.out.println("New Phone Number");
                sc.nextLine();
                hh.setPhone(sc.nextLine());
                choice='L';
            }
            System.out.println("The Student Details");
            System.out.println(hh.getStudentId()+" "+hh.getName()+" "+hh.getDepartmentId()+" "+hh.getGender()+" "+hh.getPhone()+" "+hh.getHostelName()+" "+hh.getRoomNumber());
    }
}