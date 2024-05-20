package loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {

		List <String> listObj = new ArrayList<String>();
		
		listObj.add("Sachin");
		listObj.add("Dhoni");
		listObj.add("Kohli");
		listObj.add("Ashwin");
		listObj.add("Rohit");
		listObj.add("Rohit");
		
		Iterator<String> iter = listObj.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
			

		
	}

}
