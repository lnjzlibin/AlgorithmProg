package libin.algorithm.calendar;

import java.util.Calendar;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Week week = new Week();
//		System.out.println("2015,5,20 is "+week.zellerWeek(1975, 6, 28));
		Calendar ca = Calendar.getInstance();
		ca.set(1,0,1);
		System.out.println(ca.getTime());
	}
}
