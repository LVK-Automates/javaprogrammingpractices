package stringPrograms;

public class StringExamples {

	public static void main(String[] args) {

		
		
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		
		//equals method is used to compare two objects as both the values are same 
		//and both refer to the same object, below sop statement will print true
		System.out.println(str1.equals(str2));
		
		
		
		StringBuffer sBuffer1 = new StringBuffer("Java Programming");
		StringBuffer sBuffer2 = new StringBuffer("Java Programming");
		
		//below sop statment will print false as in StringBuffer, two separate objects
		//will be created to store the values
		
		System.out.println(sBuffer1.equals(sBuffer2));
		
		//below sop statment will print false as in StringBuilder, two separate objects
		//will be created to store the values

		StringBuilder sBuilder1 = new StringBuilder("Java Programming");
		StringBuilder sBuilder2 = new StringBuilder("Java Programming");

		System.out.println(sBuilder1.equals(sBuilder2));
		
		
		
	}

}
