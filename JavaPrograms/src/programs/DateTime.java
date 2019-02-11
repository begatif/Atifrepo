package programs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.math.*;
import java.util.regex.*;

public class DateTime {

	   public static void main(String[] args) {
//		        Scanner in = new Scanner(System.in);
//		   08 05 2015
		        String month = "08";
		        String day = "05";
		        String year = "2015";
		        
		        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
		        String weekdays[] = dfs.getWeekdays();
		        
		        Calendar cal = new GregorianCalendar(Locale.US);
		        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
		        System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());
		               
		       
		        
		    }
		
	}


