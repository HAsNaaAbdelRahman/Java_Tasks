import java.util.Scanner;
public class Date {
		int month ;
		int day ;
		int year ;
		public Date() {
			month = 0 ;
			day = 0 ;
			year = 0 ;
		}
		public Date(int month, int day, int year) {
			this.month = month;
			this.day = day;
			this.year = year;
		}

		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public static void getDate() {
			System.out.println("Enter Day , month , year !");
		}
		public void showDate() {
			System.out.println(day + "/" + month + "/" + year);
		}


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x , y , z ;
		Date m1 = new Date();
		getDate();
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		m1.setDay(x);
		m1.setMonth(y);
		m1.setYear(z);
		m1.showDate();
		
		
        

	

}
}
