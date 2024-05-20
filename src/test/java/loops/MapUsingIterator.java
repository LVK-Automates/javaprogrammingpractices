package loops;

import java.util.HashMap;
import java.util.Iterator;

public class MapUsingIterator {

	public static void main(String[] args) {

		HashMap<Integer, String> hmObj = new HashMap<Integer, String>();
		
		
		hmObj.put(7, "Laxman");
		hmObj.put(1, "Sachin");
		hmObj.put(2, "Rahul");
		hmObj.put(3, "Rahul");
		hmObj.put(4, null);
		hmObj.put(5, null);
		hmObj.put(6, "Rohit");
		
		Iterator<Integer> iter = hmObj.keySet().iterator();
		
		while(iter.hasNext()) {
			
			int key = iter.next();
			
			System.out.println("Key: "+key+" Value: "+hmObj.get(key));
		}

	}

}
