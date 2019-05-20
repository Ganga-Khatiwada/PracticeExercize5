/* Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array */

package com.stackroute.Prac5;
import java.util.*;

public class ArrayOfStrings {
    public Map<String,Boolean> arrayOfString(String[] strings){
        int count=1;
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        for(String str:strings){
            if(!map.containsKey(str))
                map.put(str,false);
            else{
                count++;
                if(count>1)
                    map.put(str,true);
                else
                    map.put(str,false);
                }
            }
            return map;
        }
    }
