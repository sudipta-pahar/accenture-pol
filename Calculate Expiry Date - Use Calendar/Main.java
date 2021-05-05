import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String d = sc.next();
		int add=sc.nextInt();
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Date BOD=null;
		df.setLenient(false);
		try {
		    BOD=df.parse(d);
		} catch(Exception e) {
		}
		Calendar c=Calendar.getInstance();
		c.setTime(BOD);
		c.add(Calendar.MONTH, add);
		//Date dd=c.getTime();
		DateFormat df1=new SimpleDateFormat("dd/MM/yyyy");
		String d1=df1.format(c.getTime());
		System.out.println(d1);
	    //FILL THE CODE
	
	}

}
