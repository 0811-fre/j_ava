package cn.young.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lamda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peterF", "anna", "mike", "xenia");
        /*Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });*/

        System.out.println(names);

        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        System.out.println(names);
    }


}
