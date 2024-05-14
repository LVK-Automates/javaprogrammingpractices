package stringPrograms;
public class StringSplitExample {

	public static void main(String[] args) {

		
		String splitStrings = " Java, Programming, Training ";
		
		String [] splitValues = splitStrings.split(",");
		
		
		System.out.println(splitValues[2]);
		System.out.println(splitValues[0]);
		
		//below sop statement will throw ArrayIndexOutOfBoundsException
		//System.out.println(splitValues[4]);
		
		//Example for replace()
		String replacedValue = splitStrings.replace(",","").replace("Training","Course");
		System.out.println(replacedValue);
	}

}
