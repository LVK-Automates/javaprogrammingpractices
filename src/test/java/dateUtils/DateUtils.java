package dateUtils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class DateUtils {

	
	/**
	 * @description: creates a date
	 * @param year
	 * @param mon
	 * @param day
	 * @return LocalDate instance
	 */
	public static LocalDate setDate(int year, int mon, int day) {
		
		return LocalDate.of(year, mon, day);
	}
	
	/**
	 * Description: This method will covert the given date into the desired format that is specified in the method argument 
	 * 'String dateFormat'
	 * @param dateFormat
	 * @param dateTimeObj
	 * @return formatted date in string format
	 * 
	 */
	public static String setDateFormat(String dateFormat, LocalDate dateTimeObj) {
		
		String formattedDate = null;
		try {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
			formattedDate = dateTimeFormatter.format(dateTimeObj);
		}
		catch (DateTimeException  e) {
			e.printStackTrace();
		}
		return formattedDate;
	}


	
	/**
	 * 
	 * @return current date
	 * 
	 */
	public static LocalDate getCurrentDate() {
		
		return LocalDate.now();
	}
	
	/**
	 * @param dateFormat
	 * @return current date in the given date format in the method arg
	 */
	public static String getCurrentDate(String dateFormat) { 
		
		LocalDate dateTimeObj = null;
		String currentDate = null;
		try {
			dateTimeObj = LocalDate.now();
			currentDate = setDateFormat(dateFormat, dateTimeObj);
		} 

		catch (DateTimeException  e) {
			e.printStackTrace();
		}

		return currentDate;
	}
	
	/**
	 * 
	 * Description: This method calculates difference between two given two dates and returns the difference 
	 * in long data type
	 * @param date1
	 * @param date2
	 * @return long value difference between two dates calculated in days
	 */
	public static long differenceBetweenDatesInDays(LocalDate date1, LocalDate date2) {
		
		long diffInMonths = ChronoUnit.DAYS.between(date1, date2); 
		return diffInMonths;
		
	}

	
	/**
	 * 
	 * Description: This method calculates difference between two given two dates and returns the difference 
	 * in long data type
	 * @param date1
	 * @param date2
	 * @return long value difference between two dates calculated in months
	 * 
	 */
	public static long differenceBetweenDatesInMonths(LocalDate date1, LocalDate date2) {
		
		
		long diffInMonths = ChronoUnit.MONTHS.between(date1, date2); 
		return diffInMonths;
		
	}
	
	/**
	 * 
	 * Description: This method calculates difference between two given two dates and returns the difference 
	 * in long data type
	 * @param date1
	 * @param date2
	 * @return long value difference between two dates calculated in years
	 * 
	 */
	public static long differenceBetweenDatesInYears(LocalDate date1, LocalDate date2) {
		
		long diffInMonths = ChronoUnit.YEARS.between(date1, date2); 
		return diffInMonths;
		
	}

	/**
	 * @description: creates a future date instance in the given format from the current date. 
	 * No. of years can be added to the current date 
	 * eg: if the given date is '01-01-2000' and yearsToAdd is given as 1 in the method arg then 
	 * the result will '01-01-2001'
	 * 
	 * @param dateFormat
	 * @param yearsToAdd
	 * @return future date as LocalDate instance
	 * 
	 * 
	 */
	public static String setFutureDateInYears(String dateFormat, long yearsToAdd) {
		
		LocalDate futureDateObj = null;
		LocalDate currentDateObj = null;
		String futureDatePattern =  null;
		
		try {
			currentDateObj = getCurrentDate();
			futureDateObj = currentDateObj.plusYears(yearsToAdd);
			futureDatePattern = setDateFormat(dateFormat, futureDateObj);
		}
		catch (DateTimeException e)
		{
			e.printStackTrace();
		}
		return futureDatePattern;
	}
	
	/**
	 * @description: creates a future date instance in the given format from the current date. 
	 * No. of months can be added to the current date 
	 * eg: if the given date is '01-01-2000' and monthsToAdd is given as 1 in the method arg then 
	 * the result will '01-02-2000'
	 * 
	 * @param dateFormat
	 * @param monthsToAdd
	 * @return future date as String
	 * 
	 * 
	 */
	
	public static String setFutureDateInMonths(String dateFormat, long monthsToAdd) {
		
		LocalDate futureDateObj = null;
		LocalDate currentDateObj = null;
		String futureDatePattern =  null;
		
		try {
			currentDateObj = getCurrentDate();
			futureDateObj = currentDateObj.plusMonths(monthsToAdd);
			futureDatePattern = setDateFormat(dateFormat, futureDateObj);
		}
		catch (DateTimeException e)
		{
			e.printStackTrace();
		}
		return futureDatePattern;
	}
	
	/**
	 * @description: creates a future date instance in the given format from the current date. 
	 * No. of days can be added to the current date 
	 * eg: if the given date is '01-01-2000' and daysToadd is given as 1 in the method arg then 
	 * the result will '02-01-2000'
	 * 
	 * @param dateFormat
	 * @param daysToAdd
	 * @return future date as String 
	 * 
	 * 
	 */

	
	public static String setFutureDateInDays(String dateFormat, long daysToAdd) {
		
		LocalDate futureDateObj = null;
		LocalDate currentDateObj = null;
		String futureDatePattern =  null;
		
		try {
			currentDateObj = getCurrentDate();
			futureDateObj = currentDateObj.plusDays(daysToAdd);
			futureDatePattern = setDateFormat(dateFormat, futureDateObj);
		}
		catch (DateTimeException e)
		{
			e.printStackTrace();
		}

		return futureDatePattern;
	}

	/**
	 * @param pattern
	 * @param months
	 * @return
	 */
	public static String setDateTimeMonthsAMPMFormat(String pattern, long months) {

		String dateTime = null;

		try {

			LocalDateTime localDateTimeObj = LocalDateTime.now();

			localDateTimeObj = localDateTimeObj.plusMonths(months);

			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);

			dateTime = dateTimeFormatter.format(localDateTimeObj);


		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		return dateTime;
	}




	public static void main(String as[]) {
		
		//gives the date that is 1 year ahead from current date
		System.out.println(setFutureDateInYears("MM/dd/yyyy",1));
		
		//adds 3 days from current date
		System.out.println(setFutureDateInDays("MM/dd/yyyy",3));
		
		//adds 2 months from current date
		System.out.println(setFutureDateInMonths("MM/dd/yyyy",2));
		
		//calculates the difference between two dates and gives the result in days
		System.out.println(differenceBetweenDatesInDays(setDate(2025,04,10), setDate(2027,04,18)));
		
		//calculates the difference between two dates and gives the result in years
		System.out.println(differenceBetweenDatesInYears(setDate(2025,04,10), setDate(2027,04,18)));
		
		//calculates the difference between two dates and gives the result in months
		System.out.println(differenceBetweenDatesInMonths(setDate(2025,04,10), setDate(2027,05,18)));
		
		//prints the current date
		System.out.println(getCurrentDate());
		
		System.out.println("Prints the current date in the given format: "+getCurrentDate("MM-dd-yyyy"));

		String dateTimeWithAMPM = setDateTimeMonthsAMPMFormat("yyyy-MM-dd hh:mm a", 1).toString();
		System.out.println("Date and Time with AM/PM Format: "+dateTimeWithAMPM);
		
		
	}
}
