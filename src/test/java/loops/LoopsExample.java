package loops;

public class LoopsExample {

	public static void main(String[] args) {

		
		//loops
		
		for(int i = 0; i<=10 ; i++) {
			
			System.out.println(i);
		}
		
		System.out.println("REVERSE USING FOR LOOP");
		
		for(int i = 10; i>=0; i --) {
			
			System.out.println(i);
		}
		
		System.out.println("INCRMENT BY 2");
		
		for(int i = 0; i<=10 ; i=i+2) {
			
			System.out.println(i);
		}
		
		System.out.println("ARRAYS USING FOR LOOP");
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println("ARRAYS USING ENHANCED FOR LOOP");
		
		for(int i : arr)
			System.out.println(i);
		
		
		System.out.println("USING WHILE LOOP");

		int i = 0;
		
		while(i < 0) {
			
			System.out.println(i);
			i++;
			
			
		}
		
		System.out.println("USING DO-WHILE LOOP");
		
		int j = 0;
		
		do {
			
			System.out.println(j);
			j++;
		}
		while(j<0);
		
		
		
		
	}

}
