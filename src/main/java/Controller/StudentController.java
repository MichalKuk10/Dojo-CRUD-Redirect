package Controller;

import Model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "allStudents", urlPatterns = {"/students"})
public class StudentController extends HttpServlet {
    private List<Student> listOfStudents;




    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(1,"Mcihał", "KUK", 45));
        request.setAttribute("entry", listOfStudents);

        response.setHeader("Send", "Success");
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(1,"Mcihał", "KUK", 45));
        listOfStudents.add(new Student(2,"Ktoś", "tam", 45));
        request.setAttribute("entry", listOfStudents);

        response.setHeader("Send", "Success");
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }


    public StudentController(){
        listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(1,"Mcihał", "KUK", 45));
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
