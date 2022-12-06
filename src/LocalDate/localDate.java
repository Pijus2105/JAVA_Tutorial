package LocalDate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class localDate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Year = sc.nextInt();
		
		int Month = sc.nextInt();
		int Days = sc.nextInt();
		
      LocalDate pdate = LocalDate.of(Year, Month, Days);
      
      LocalDate nowDate = LocalDate.now();
      
      Period diff = Period.between(pdate, nowDate);
      
      System.out.print("Year :- " + diff.getYears());
      System.out.print(" Months :-" + diff.getMonths());
      System.out.print(" Days :-" + diff.getDays());
	}

}
