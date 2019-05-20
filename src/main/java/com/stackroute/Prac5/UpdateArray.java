/* Write a Java program to update specific array element by given element and empty the array list. */

package com.stackroute.Prac5;
import java.util.ArrayList;

public class UpdateArray {
    public ArrayList arrayelements(ArrayList list_strings)
    {
        ArrayList<String> list_Strings = new ArrayList<String>();   //ArrayList
        System.out.println(list_strings);
        list_Strings.set(0, "Kiwi");  //updates the list_string
        list_strings.clear();
        return list_Strings;
    }
    public ArrayList arrayelement(ArrayList list_Strings)
    {
        ArrayList<String> list_Strings1 = new ArrayList<String>();
        System.out.println(list_Strings1);
        list_Strings1.set(2, "Mango");   //updates the list_string
        return list_Strings1;
    }
}
