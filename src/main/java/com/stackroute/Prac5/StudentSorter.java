/* Creating a `StudentSorter` class that implements `Comparator interface` */

package com.stackroute.Prac5;
import java.util.Comparator;

public class StudentSorter implements Comparator {
    public int compare(Object ob1, Object ob2) {

        //here it sorts the sname,age and id according to the conditions
        if (((Student) (ob1)).getAge() > ((Student) (ob2)).getAge()) {
            return -1;
        }
        else if (((Student) (ob1)).getAge() == ((Student) (ob2)).getAge())
        {
            if ((((Student) (ob1)).getSName().compareTo(((Student) (ob2)).getSName()) > 0)) {
                return -1;
            }
            else if((((Student) (ob1)).getSName().equals(((Student) (ob2)).getSName()))) {
                if(((Student) (ob1)).getId() > ((Student) (ob2)).getId())
                {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else {
                return 1;
            }
        }
        else
        {
            return 1;
        }

    }
}
