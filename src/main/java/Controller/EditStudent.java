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
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@WebServlet(name = "editStudents", urlPatterns = {"/edit"})
public class EditStudent extends HttpServlet {
    private int idStudent;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Student.listOfStudents.add(new Student("Mcihał", "KUK", 45));


        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        Student.listOfStudents.get(idStudent).setFirstName(firstName);
        Student.listOfStudents.get(idStudent).setLastName(lastName);
        Student.listOfStudents.get(idStudent).setAge(Integer.parseInt(age));
        //Student.listOfStudents.add(new Student(firstName, lastName, Integer.parseInt(age)));



        response.setHeader("Send", "Success");
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, String[]> parameters = request.getParameterMap();
        String id = parameters.get("id")[0];
        idStudent = Integer.parseInt(id) - 1;
        Student student = Student.listOfStudents.get(idStudent);
        request.setAttribute("student", student);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("edit.jsp");
        dispatcher.forward(request, response);
    }
}
