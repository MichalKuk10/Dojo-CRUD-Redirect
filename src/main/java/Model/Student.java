package Model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int countStudents = 0;
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    public static ArrayList<Student> listOfStudents = new ArrayList<Student>();

    public Student(String firstName, String lastName, int age) {
        this.id = ++countStudents;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
