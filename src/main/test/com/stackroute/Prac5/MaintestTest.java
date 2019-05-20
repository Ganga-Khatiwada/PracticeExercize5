package com.stackroute.Prac5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class MaintestTest {
    MainTest mt;

    @Before
    public void setup() {
        //arrange
        mt = new MainTest();
    }

    @After
    public void tearDown() {
        //arrange
        mt = null;
    }

    @Test
    public void Student_idsnameage_shouldreturnsortedlist() {

        Student s1 = new Student(1,"Ganga",23);
        Student s2= new Student(2, "Kaushiky", 22);
        Student s3= new Student(3, "Saumya", 20);
        Student s4= new Student(4, "Mansi", 24);
        Student s5= new Student(5, "Neha", 21);

        ArrayList alt=new ArrayList();
        alt.add(s1);
        alt.add(s2);
        alt.add(s3);
        alt.add(s4);
        alt.add(s5);
        String str="[Student{id=4, sname='Mansi', age=24}, Student{id=1, sname='Ganga', age=23}, Student{id=2, sname='Kaushiky', age=22}, Student{id=5, sname='Neha', age=21}, Student{id=3, sname='Saumya', age=20}]";
        assertEquals(str,mt.afterComparision(alt).toString() );

    }
}
