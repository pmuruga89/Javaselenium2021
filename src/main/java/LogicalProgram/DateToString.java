package LogicalProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = new Date();
		String s = sdf.format(d);
		System.out.println(s);
		
		//Convert date to String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		String sd = "28/09/2022";
		
		d = sdf1.parse(sd);
		
		
		System.out.println(d);
		
	}

}
