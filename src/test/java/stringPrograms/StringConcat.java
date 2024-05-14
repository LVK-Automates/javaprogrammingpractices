package stringPrograms;

public class StringConcat {

	public static void main(String[] args) {

		//String is immutable, in the below code
		
		String str = "Java";
		str.concat("Programming");
		
		//programming will not concatenated with Java
		System.out.println(str);
		
		//StringBuffer and StringBuilder are mutable Programming will be
		//appended to Java
		
		StringBuffer sbuffer = new StringBuffer("Java");
		sbuffer.append("Programming");
		
		System.out.println(sbuffer);
		
		StringBuilder sbuilder = new StringBuilder("Java");
		sbuilder.append("Programming");
		System.out.println(sbuilder);
		
			
	}

}
