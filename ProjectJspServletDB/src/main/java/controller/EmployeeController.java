package controller;

import dao.EmployeeDao;
import model.Employee;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import dao.EmployeeDao;
import model.Employee;

public class EmployeeController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/employee.jsp";
    private static String LIST_EMPLOYEE = "/listEmployee.jsp";
    private EmployeeDao dao;

    public EmployeeController(){
        super();
        dao = new EmployeeDao();
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Employee employee = new Employee();
        employee.setFirstName(request.getParameter("firstName"));
        employee.setLastName(request.getParameter("lastName"));
        try{
            Date dob = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("dob"));
            employee.setDob((java.sql.Date) dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        employee.setEmail(request.getParameter("email"));
        String id = request.getParameter("id");
        if(id == null || id.isEmpty())
        {
            dao.addEmployee(employee);
        }else
        {
            employee.setId(Integer.parseInt(id));
            dao.updateEmployee(employee);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_EMPLOYEE);
        request.setAttribute("EmployeesDB", dao.getAllEmployee());
        view.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int id = Integer.parseInt(request.getParameter("id"));
            dao.deleteEployee(id);
            forward = LIST_EMPLOYEE;
            request.setAttribute("EmployeesDB", dao.getAllEmployee());
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int id = Integer.parseInt(request.getParameter("id"));
            Employee employee = dao.getEmployeeById(id);
            request.setAttribute("EmployeesDB", employee);
        } else if (action.equalsIgnoreCase("listEmployee")){
            forward = LIST_EMPLOYEE;
            request.setAttribute("EmployeesDB", dao.getAllEmployee());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

}
