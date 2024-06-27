package loops;

import java.util.ArrayList;
import java.util.List;

public class filterExample {

    public static void main(String[] args) {
        {

            List<Integer> listObj = new ArrayList<Integer>();
            listObj.add(1);
            listObj.add(4);
            listObj.add(3);
            listObj.add(2);
            listObj.add(5);
            listObj.add(6);
            listObj.add(7);

            /**
             * below line of code will iterate through all the stream of elements and prints
             * the values that are >=4
             * output: 4567
             */
            listObj.stream().filter( val -> val >= 4).forEach(System.out::print);

        }
    }
}
