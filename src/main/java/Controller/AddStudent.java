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


@WebServlet(name = "allStudents", urlPatterns = {"/add"})
public class AddStudent extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Student.listOfStudents.add(new Student("Mcihał", "KUK", 45));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        Student.listOfStudents.add(new Student(firstName, lastName, Integer.parseInt(age)));



        response.setHeader("Send", "Success");
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        RequestDispatcher dispatcher
                = request.getRequestDispatcher("details.jsp");
        dispatcher.forward(request, response);
    }


    public AddStudent(){
//        listOfStudents = new ArrayList<>();
//        listOfStudents.add(new Student(1,"Mcihał", "KUK", 45));
    }

    public void handle(){

    }
    private void index(){

    }

    private void add(int id, String firstName, String lastName, int age){
        Student newStudent = new Student( firstName, lastName, age);
//        listOfStudents.add(newStudent);
    }

    private void edit(int id){

    }

    private void delete(int id){

    }
}
