package stringPrograms;

public class StripExamples {

	public static void main(String[] args) {

		String str1 = " Java ";
		
		System.out.println(str1.trim());
		
		//strip removes spaces from both leading and trailing ends
/*
		String strippedValue = str1.strip();
		System.out.println("Length of the string after the strip():"+strippedValue.length());
		System.out.println("Value after Stripping: "+strippedValue);
*/

		//stripLeading removes spaces from both leading end
/*
		String  str2 = " Java ";
		String stripLeadingValue = str2.stripLeading();
		System.out.println("Length of the string after the stripLeading():"+stripLeadingValue.length());
		System.out.println("Value after leading spaces removed:"+stripLeadingValue);
		
		
		//stripTrailing removes spaces from both trailing end
		String str3 = " Java ";
		String stripTrailingValue = str3.stripTrailing();
		System.out.println("Length of the string after the stripLeading():"+stripTrailingValue.length());
		System.out.println("Value after trailing spaces removed:"+stripTrailingValue);
*/

	}

}
