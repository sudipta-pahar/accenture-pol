import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String olddate= sc.next();
		String newDate = "15/12/2020";
		Date old_date = new Date();
		Date new_Date = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		try {
		    old_date = sdf.parse(olddate);
		    new_Date = sdf.parse(newDate);

	    long diff_ms = new_Date.getTime() - old_date.getTime();
	    long diff= diff_ms/(1000l*60*60*24*365);
	    System.out.println(diff+" years");
		}
		catch(ParseException e){
		    
		}
	    
	
	}

}
