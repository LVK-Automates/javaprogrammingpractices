package loops;

import java.util.ArrayList;
import java.util.List;

public class ListUsingForEach {

	public static void main(String[] args) {

		
	List <String> listObj = new ArrayList<String>();
		
		listObj.add("Sachin");
		listObj.add("Dhoni");
		listObj.add("Kohli");
		listObj.add("Ashwin");
		listObj.add("Rohit");
		listObj.add("Rohit");
		
		listObj.forEach(System.out::println);

	}

}
