package javaLatestVersions;

import java.util.Map;

public class ImmutableMap {

    public static void main(String[] args) {


        Map<Integer, String> mapObj = Map.of(1,"LVK",2,"Kirthi", 3,"Vasan");
        mapObj.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
        //Below code throws a null pointer exception
        //Map<Integer, String> mapObj = Map.of(1,null,2,"Kirthi", 3,"Vasan");
       // System.out.println(mapObj);

        /*
            Code below is supported
         */
        ;
    }
}
