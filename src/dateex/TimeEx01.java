package dateex;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/*java.time.LocalDate
java.time.LocalDateTime
java.time.LocalTime*/

public class TimeEx01 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String today = formater.format(cal.getTime());
		System.out.println("cal.getTime() : " + cal.getTime());
		System.out.println("today : " + today);
		System.out.println("------------------------------------------------------");
		
		//import java.util.Date 잘안씀 
		Date time2 = new Date();
		System.out.println("time2 : " + time2);
		System.out.println("time2.getTime() : " + time2.getTime());
		System.out.println("time2.getDay() : " + time2.getDay());
		System.out.println("------------------------------------------------------");
		
		//java.sql.Date import가 미리 되있음 경로설정해줘야함  1070.01.01 기준 경과된초를 계산
		java.sql.Date time3 = new java.sql.Date(24*3600*1000);
		System.out.println("time 3 " + time3);
		System.out.println("------------------------------------------------------");
		
		//java.sql.Timestamp
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = new Date();
		String timestamp = sf.format(d.getTime());
		
		Timestamp ts = Timestamp.valueOf(timestamp);
		System.out.println("ts : " + ts);
		System.out.println("------------------------------------------------------");
		
		//LocalDateTime db에서 자바로
		Timestamp nowDate = Timestamp.valueOf(LocalDateTime.now());
		System.out.println("nowDate : " + nowDate);
		//LocalDateTime 자바에서 db로
		LocalDateTime ldt = nowDate.toLocalDateTime();
		System.out.println("ldt : " + ldt);
		System.out.println("------------------------------------------------------");
		
		System.out.println("LocalDateTime : " + LocalDateTime.now());
		System.out.println("LocalDate : " + LocalDate.now());
		System.out.println("LocalTime : " + LocalTime.now());
	}
}
