/* Write a program to implement set interface which sorts the given randomly ordered names in ascending order. Convert the sorted set in to an array list */

package com.stackroute.Prac5;
import java.util.*;

public class SetInterface {
     public String SetInterface_names_shouldreturnorderednames(String s)
     {
            s = "Harry Olive Alice Pluto Eugene";
            String[] a= s.split(" ");
            for (String i :a )
            System.out.println(i);
            HashSet<String> i = new HashSet<String>();
            System.out.println(i);
            List<String> list = new ArrayList<String>(i);
            Collections.sort(list);
            System.out.println(list);
            return String.valueOf(list);
    }
}
