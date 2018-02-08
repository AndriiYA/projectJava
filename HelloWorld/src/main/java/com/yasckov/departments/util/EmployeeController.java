package com.yasckov.departments.util;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yasckov.departments.dao.EmloyeeDAO;
import com.yasckov.departments.model.Employee;

import java.io.IOException;

public class EmployeeController extends HttpServlet{
    private static final long serialVersionUID = 1L;

    private static final String PAGE_EDIT = "/EditEmployee.jsp";
    private static final String PAGE_LIST = "/ListEmployee.jsp";

    private static final String ACTION_VALUE = "action";
    private static final String ACTION_DELETE = "delete";
    private static final String ACTION_EDIT = "edit";
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

    public EmployeeController (){
        super();
        dao = EmloyeeDAO.getInstance();
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter(ACTION_VALUE);

        if (action != null)
            switch (action) {
                case ACTION_LIST:
                    forward = PAGE_LIST;
                    request.setAttribute(ATTRIBUTE_LIST, dao.);
                    break;

            }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    private Employee parse(HttpServletRequest request){
        return null;
    }
}


