import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to add");
		int number= sc.nextInt();
		sc.nextLine();
		ArrayList<String> obj= new ArrayList<String>();
		for(int i=0; i<number; i++){
		    obj.add(sc.nextLine());
		}
		for(int i=0; i<obj.size(); i++){
		    System.out.println(obj.get(i));
		}
		// Fill your code here
	}

}