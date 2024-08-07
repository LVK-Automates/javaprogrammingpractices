package javaLatestVersions;

import java.util.List;

public class ImmutableList {

    public static void main(String[] args) {
        List<String> listObj = List.of("Kohli","Rohit","Ashwin","Dhoni","LVK");
        /*
           Below codes will throw UnsupportedOperationException
         */
         System.out.println(listObj.add("Jaiswal"));
        // System.out.println(listObj.remove(2));

        /**
         * Below codes will work as usual
         */
        System.out.println(listObj);
        listObj.stream().forEach(System.out::println);


    }
}
