package loops;

import java.util.ArrayList;
import java.util.List;

public class DropWhileExample {

    public static void main(String[] args) {
        List<Integer> listObj = new ArrayList<>();
        listObj.add(4);
        listObj.add(4);
        listObj.add(6);
        listObj.add(2);
        listObj.add(5);
        listObj.add(1);
        listObj.add(7);

        /**
         * In the below code, all the elements satisfies the conditions, hence all the elements will be skipped and prints nothing
         * output:
         */
         listObj.stream().dropWhile( val -> val >= 1).forEach(System.out::print);
        /**
         * In the below code, matching operation will skip till 6, as the condition becomes false for 2 it stops the operation and returns the remaining elements
         * output: 2517
         */
        //listObj.stream().dropWhile( val -> val >= 3).forEach(System.out::print);
        /**
         * In the below condition, as the condition for the first two elements are satisfied it will be skipped and remaining elements will be printed
         * output: 62517
         */
        //listObj.stream().dropWhile( val -> val == 4).forEach(System.out::print);

        /**
         * Condition for the first element itself fails in the below code, hence it will print all the elements.
         * output: 4462517
         */
        //listObj.stream().dropWhile( val -> val < 4).forEach(System.out::print);

    }
}
