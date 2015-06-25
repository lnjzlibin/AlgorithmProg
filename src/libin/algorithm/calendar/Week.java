package libin.algorithm.calendar;

public class Week {
	public int zellerWeek(int year,int month,int day)
	{
		int m = month;
		int d = day;
		if(month<=2)
		{
			year--;
			m=month+12;
		}
		int y=year%100;
		int c = year/100;
		int w=(y+y/4+c/4-2*c+(13*(m+1)/5)+d-1)%7;
		if(w<0)
			w+=7;
		return w;
	}
}
