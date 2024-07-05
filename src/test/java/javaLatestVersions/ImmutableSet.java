package javaLatestVersions;

import java.util.Set;
import java.util.stream.Collectors;

public class ImmutableSet {

    public static void main(String[] args) {
        Set<String> setObj = Set.of("Kohli","Ashwin","Dhoni","Natrajan");
        /**
         * Below operations are unsupported
         */
        // System.out.println(listObj.add("Jaiswal"));
        // System.out.println(listObj.remove(2));
        System.out.println(setObj);

        /***
         * Below is a supported operation
         */
        System.out.println(setObj.stream().filter(str -> str.contains("A")).collect(Collectors.toSet()));

    }
}
