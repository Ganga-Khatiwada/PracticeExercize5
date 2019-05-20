/* Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair. */

package com.stackroute.Prac5;
import java.util.*;

public class CountFrequencies {
    public static Map countFrequencies(String string) {
        String[] list = string.split("[^a-z]+");  //splits the list based on the regex value
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(list));
        Set keys = new LinkedHashSet<>();
        Map fval = new LinkedHashMap();
        ArrayList alt = new ArrayList();
        keys.addAll(arrayList);
        alt.addAll(keys);
        int[] count = new int[keys.size()];
        int m = 0;
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            count[m] = Collections.frequency(arrayList, it.next());
            m++;
        }
        for (int j = 0; j < alt.size(); j++) {
            fval.put(alt.get(j), count[j]);
        }
        return fval;
    }
}
