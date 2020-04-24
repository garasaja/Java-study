package dateex;

import java.text.DecimalFormat;
import java.util.Calendar;

public class CalenderEx {
	
	public static void printCalendar(String msg , Calendar cal) {
		DecimalFormat df= new DecimalFormat();
		int a= 10;
		int b = 5;
		System.out.println((a>b)? a:b);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		
		String mon;
		if(month <10) {
			mon = "0" + month;
		} else {
			mon = "" + month;
		}
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hh = cal.get(Calendar.HOUR);
		
		String h = (hh<10)? "0" + hh : "" + hh;
		int mm = cal.get(Calendar.MINUTE);
		String m = (mm<10)? "0" + mm : "" + mm;
		int ss = cal.get(Calendar.SECOND);
		String s = (ss<10)? "0" + ss : "" + ss;
		/*System.out.println("몇월? " + month);
		System.out.println("DAY : " + day);
		System.out.println("dayOfWeek : " + dayOfWeek);*/
		
		System.out.println(year + "-" + mon + "-" + day + ":" + h + ":" + m + ":" + s);
		
		
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("현재",now);
	}
}
