package loops;

import java.util.List;

public class ForEachOrdered {

	public static void main(String[] args) {

		
		List<String> values = List.of("Java","Javasript","Python","GoLang","Spring","Springboot");
		
		values.parallelStream().forEachOrdered(System.out::println);
	}

}
