/** 
 * desc: Program to print the duration in days, months and years with regards to current system date.
 * author@ Yerram Sahithi
 * Date:28-10-2020
 */
import java.time.LocalDate;
import java.time.Period;

public class DurationFromDate {
	public static void main(String[] args) {
		LocalDate duration=LocalDate.of(2014,07,15);
		printDuration(duration);
	}
	public static void printDuration(LocalDate ll)
	{
		Period period = Period.between(ll, LocalDate.now());
		System.out.println("days are: "+period.getDays());
		System.out.println("months are: "+period.getMonths());
		System.out.println("years are: "+period.getYears());
	}
}
