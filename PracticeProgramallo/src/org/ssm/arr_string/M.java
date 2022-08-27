package org.ssm.arr_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class M {
    public static void main(String[] args) {
 
        String text = "now how now how cow how now now now cow cow cow";
 
        List<String> list = Arrays.asList(text.split(" "));
 
        Set<String> Words = new HashSet<String>(list);
        for (String word : Words) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }
}