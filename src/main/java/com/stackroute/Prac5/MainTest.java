/* Write a class `Maintest` create Student class object(minimum 5) */

package com.stackroute.Prac5;
import java.util.*;

public class MainTest {
    public List afterComparision(List stu) {
        StudentSorter ss = new StudentSorter();
        Collections.sort(stu, ss);
        return stu;
    }
}