package loops;

import java.util.*;

public class ForEachOrdered {

	public static void main(String[] args) {

		
		List<String> values = List.of("Java","Javasript","Python","GoLang","Spring","Springing");
		
		values.parallelStream().forEachOrdered(System.out::println);
	}

}
