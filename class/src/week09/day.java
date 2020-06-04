package week09;

public class day {
	public enum DayOfWeek {  
	  Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	}
	private DayOfWeek dd = DayOfWeek.Monday;
	public DayOfWeek getDayOfWeek() {
		return dd;
	}
	public void setDayOfWeek(DayOfWeek newday) {
		dd = newday;
	}
}
