package javabook.ch6;

//import java.util.Scanner;

/*public class Ch6Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("PATH :"+System.getenv("PATH"));
		System.setProperty("user", "hong");
		System.out.println("user : "+System.getProperty("user"));
		System.out.println("종료하려면 x를 누르세요");
		
		while(true){
			if(scanner.next().equals("x")){
				System.out.println("program exit");
				System.exit(0);
			}
			else
				System.out.println("again input");
		}

	}

}*/

/*import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ch6Ex4{
	public static void main(String[] args){
		Date date1=new Date();
		Date date2=new Date(1231412547);
		System.out.println("date1: "+date1);
		System.out.println("date2: "+date2);
		
		System.out.println("date1, date2 compare : "+date1.compareTo(date2));
		
		Calendar cal=Calendar.getInstance(TimeZone.getTimeZone("GMT+2"));
		
		System.out.println("time : "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE));
	}
}*/

import java.util.Scanner;

public class Ch6Ex4{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String msg=scan.next();
		int num=scan.nextInt();
		System.out.println("input :"+num);
	}
	
}

