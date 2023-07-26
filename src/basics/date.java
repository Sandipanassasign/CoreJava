package basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/d/YYYY HH-MM-SS");
		System.out.println(sdf.format(d));
		
		System.out.println(d.toString()); 
		
		
		
		System.out.println(Calendar.DAY_OF_MONTH); 
		int month=Calendar.DAY_OF_WEEK_IN_MONTH;
	}

}
