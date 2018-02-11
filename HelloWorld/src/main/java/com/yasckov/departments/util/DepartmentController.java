package com.yasckov.departments.util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DepartmentController")
public class DepartmentController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final String PAGE_EDIT = "/EditBook.jsp";
    private static final String PAGE_LIST = "/ListBook.jsp";

    private static final String ACTION_VALUE = "action";
    private static final String ACTION_DELETE = "delete";
    private static final String ACTION_EDIT = "edit";
    private static final String ACTION_LIST = "list";
    private static final String ATTRIBUTE_ITEM = "item";
    private static final String ATTRIBUTE_LIST = "list";

    private static final String PARAMETER_ENTITY_ID = "id";
    private static final String PARAMETER_ENTITY_NAME = "name";
    private static final String PARAMETER_ENTITY_AUTHOR = "author";
    private static final String PARAMETER_ENTITY_DATE = "date";
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
