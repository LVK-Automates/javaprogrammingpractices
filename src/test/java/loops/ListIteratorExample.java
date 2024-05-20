package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		
		List <String> listObj = new ArrayList<String>();
		
		listObj.add("Sachin");
		listObj.add("Dhoni");
		listObj.add("Kohli");
		listObj.add("Ashwin");
		listObj.add("Rohit");
		listObj.add("Rohit");
		
		ListIterator<String> listIterator = listObj.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("REVERSE ORDER");
		
		while(listIterator.hasPrevious()) {
			
			System.out.println(listIterator.previous());
		}
		
		

	}

}
