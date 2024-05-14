package stringPrograms;

public class StringMethodsExamples {

	public static void main(String[] args) {

		
		String str1 = "Java";
		String str2 = "Java";
		
		StringBuilder sBuilder1 = new StringBuilder("Java");
		StringBuilder sBuilder2 = new StringBuilder("Java");
		
		StringBuffer sbuffer1 = new StringBuffer("Java");
		StringBuffer sbuffer2 = new StringBuffer("Java");

		

		//comparing two string objects using equals method
		if(str1.equals(str2))
			System.out.println("Using equals method: Equals");
		else
			System.out.println("Using equals method: Not Equals");
		
		String capString = "JAVA";
		String smallString = "java";
		
		//comparing two string objects using equalsIgnoreCase method
		if(capString.equalsIgnoreCase(smallString))
			System.out.println("Using equalsIgnoreCase method: Equals");
		else
			System.out.println("Using equalsIgnoreCase method:Not Equals");
		
		
		System.out.println("Using toLowerCase method: "+capString.toLowerCase());
		System.out.println("Using toUpperCase method: "+capString.toUpperCase());
		
		System.out.println("Comparing two strings using compareTo method: "+str2.compareTo(str1));

		
		//comparing two stringbuilder objects using equals method
		if(sBuilder1.equals(sBuilder2))
			System.out.println("Equals for StringBuilder");
		else
			System.out.println("Not Equals for StringBuilder");
		
		if(sBuilder1.equals(sBuilder2))
			System.out.println("Equals for StringBuilder");
		else
			System.out.println("Not Equals for StringBuilder");
		

		
		//comparing two stringbuffer objects using equals method
		
		if(sbuffer1.equals(sbuffer2))
			System.out.println("Equals for StringBuffer");
		else
			System.out.println("Not Equals for StringBuffer");
		
		
		System.out.println("Comparing two stringbuilder objects using compareTo method: "+sBuilder1.compareTo(sBuilder2));
		
		
		System.out.println("Comparing two stringbuilder objects using compareTo method: "+sbuffer1.compareTo(sbuffer2));
		
		//Comparing String and StringBuffer using contentEquals method
		if(str1.contentEquals(sbuffer1))
			System.out.println("Using Content Equals Method: True");
		else
			System.out.println("Using Content Equals Method: False");
		
		
		//Comparing String and StringBuilder using contentEquals method
		if(str1.contentEquals(sBuilder1))
			System.out.println("Using Content Equals for SBuilder Method: True");
		else
			System.out.println("Using Content Equals for SBuilder Method: False");
		
		String str = "Java Programming Language";
		
		//contains method example
		if(str.contains("Java"))
			System.out.println("Using Contains for String comparison: True");	
		else
			System.out.println("Using Contains for String comparison: False");	
			
		
		//Reversing a string using reverse()
		StringBuffer reversValue = new StringBuffer("Java");
		reversValue.reverse();
		System.out.println("Reversing a value: "+reversValue);
		
	}

}
