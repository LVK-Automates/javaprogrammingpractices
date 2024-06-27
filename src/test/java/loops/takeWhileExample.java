package loops;

import java.util.*;

public class takeWhileExample {

    public static void main(String[] args) {

        List<Integer> listObj = new ArrayList<Integer>();
        listObj.add(4);
        listObj.add(4);
        listObj.add(6);
        listObj.add(2);
        listObj.add(5);
        listObj.add(6);
        listObj.add(7);
        /**
         * In the below code, iteration will be stopped at the
         * first element itself as the condition is becoming false
         * so it prints nothing
         */
        listObj.stream().takeWhile( val -> val == 3).forEach(System.out::print);

        /**
         * In the below code, iteration will continue till the condition is satisfying
         * output: 446
         */
       // listObj.stream().takeWhile( val -> val >= 3).forEach(System.out::print);

        /**
         * In the below code, iteration will continue till the condition is satisfying
         * for the first two elements. for the third element it becomes false and
         * hence the iteration will be stopped
         * output: 44
         */
        //listObj.stream().takeWhile( val -> val == 4).forEach(System.out::print);

        /**
         * In the below code, iteration will continue till the condition is satisfying
         * for the first two elements. for the seventh element it becomes false and
         * hence the iteration will be stopped
         * output: 446256
         */

        listObj.stream().takeWhile( val -> val <= 6).forEach(System.out::print);




    }
}
