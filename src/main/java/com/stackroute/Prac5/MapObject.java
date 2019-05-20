/* Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows: */

package com.stackroute.Prac5;
import java.util.*;

public class MapObject {
    public Map mapObject(Map val)
    {
        Set set = val.keySet();
        Object[] obj = new Object[2];
        int m=0;
        Iterator it = set.iterator();
        while (it.hasNext()){
            obj[m]=it.next();
            m++;
        }
        Object newValue = val.get(obj[0]);
        val.put(obj[0],"");
        val.put(obj[1],newValue);
        return val;
    }
}
