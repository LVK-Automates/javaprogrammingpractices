package loops;

import java.util.HashMap;

public class MapUsingForEach {

	public static void main(String[] args) {

		
	HashMap<Integer, String> hmObj = new HashMap<Integer, String>();
		
		
		hmObj.put(7, "Laxman");
		hmObj.put(1, "Sachin");
		hmObj.put(2, "Rahul");
		hmObj.put(3, "Rahul");
		hmObj.put(4, null);
		hmObj.put(5, null);
		hmObj.put(6, "Rohit");
		
		//forEach example
		hmObj.forEach((key, value) -> System.out.println(key + "=" + value));
		

	}

}
