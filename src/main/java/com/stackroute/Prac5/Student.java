/* Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private */

package com.stackroute.Prac5;

public class Student {
    private int id;
    private String sname;
    private int age;

    public String getSName()   //getter method
    {
        return sname;
    }

    public void setSName(String sname)  //setter method
    {
        this.sname = sname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String sname, int age) {
        this.id = id;
        this.sname = sname;
        this.age = age;
    }

    public String toString() {
        return "Student{" + "id=" + id + ", sname='" + sname + '\'' + ", age=" + age + '}';

    }
}