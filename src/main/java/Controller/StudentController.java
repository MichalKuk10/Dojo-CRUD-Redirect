package Controller;

import Model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "allStudents", urlPatterns = {"/students"})
public class StudentController extends HttpServlet {
    private List<Student> listOfStudents;


    public StudentController(){
        listOfStudents = new ArrayList<>();
    }

    public void handle(){

    }
    private void index(){

    }

    private void add(int id, String firstName, String lastName, int age){
        Student newStudent = new Student(id, firstName, lastName, age);
        listOfStudents.add(newStudent);
    }

    private void edit(int id){

    }

    private void delete(int id){

    }
}
