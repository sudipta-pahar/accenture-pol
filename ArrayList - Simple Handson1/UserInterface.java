import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		int number= sc.nextInt();
		sc.nextLine();
		ArrayList<String> list= new ArrayList<String>();
		for (int i=0; i<number; i++){
		    String nn= sc.nextLine();
		    list.add(nn);
		}
		
		System.out.print(list);
		// Fill your code here
	}

}