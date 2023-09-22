import java.util.Date;
import java.text.SimpleDateFormat;
class DateTime{
	public static void main(String args[]){
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat();
		
		SimpleDateFormat df1 = new SimpleDateFormat("dd/mm/yy");
		System.out.println("Current Date is "+df1.format(date));
		
		SimpleDateFormat df2 = new SimpleDateFormat("mm-dd-yyyy");
		System.out.println("Current Date is "+df2.format(date));
		
		SimpleDateFormat df3 = new SimpleDateFormat("EEEEEEE MMMMM dd yyyy");
		System.out.println("Current Date is "+df3.format(date));
		
		SimpleDateFormat df4 = new SimpleDateFormat("EEE MMMMM dd hh:mm:ss z yyyy");
		System.out.println("Current Date is "+df4.format(date));
		
		SimpleDateFormat df5 = new SimpleDateFormat("dd/mm/yy hh:mm:ss a Z");
		System.out.println("Current Date is "+df5.format(date));
		
		SimpleDateFormat df6 = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Current Time is "+df6.format(date));
		
		SimpleDateFormat df7 = new SimpleDateFormat("w");
		System.out.println("Current Week of year is "+df7.format(date));
		
		SimpleDateFormat df8 = new SimpleDateFormat("W");
		System.out.println("Current Week of Month is "+df8.format(date));
		
		SimpleDateFormat df9 = new SimpleDateFormat("D");
		System.out.println("Current Day of year is "+df9.format(date));
	}
}
