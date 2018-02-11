package com.yasckov.departments;

import com.yasckov.departments.dao.EmloyeeDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/EmployeeController")
public class EmployeeController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final String PAGE_EDIT = "/EditEmployee.jsp";
    private static final String PAGE_LIST = "/ListEmployee.jsp";

    private static final String ACTION_VALUE = "action";
    private static final String ACTION_DELETEALL = "deleteAll";
    private static final String ACTION_DELETE_BY_ID = "deleteById";

    private static final String ACTION_LIST = "list";
    private static final String ATTRIBUTE_ITEM = "item";
    private static final String ATTRIBUTE_LIST = "list";

    private static final String PARAMETER_ENTITY_ID = "id";
    private static final String PARAMETER_ENTITY_NAME = "name";
    private static final String PARAMETER_ENTITY_AGE = "age";
    private static final String PARAMETER_ENTITY_EMAIL = "email";
    private static final String PARAMETER_ENTITY_PHONENUMBER = "phoneNumber";
    private static final String PARAMETER_ENTITY_BIRTHDAY = "birthday";

    private EmloyeeDAO dao;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String forward = "";
        String action = request.getParameter(ACTION_VALUE);



    }
}
