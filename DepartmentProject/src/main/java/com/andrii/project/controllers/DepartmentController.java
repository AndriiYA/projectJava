package com.andrii.project.controllers;

import com.andrii.project.Dao.DepartmentDao;
import com.andrii.project.model.Department;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DepartmentController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String ACTION_VALUE = "action";
    private static final String ACTION_DELETE = "delete";
    private static final String PARAMETER_ENTITY_ID = "id";
    private static final String PAGE_LIST = "/Department.jsp";
    private static final String ATTRIBUTE_LIST = "department";
    private static final String ACTION_EDIT = "edit";
    private static final String PAGE_EDIT = "/EditDepartment.jsp";
    private static final String ATTRIBUTE_ITEM = "item";
    private static final String ACTION_LIST = "list";

    private DepartmentDao dao;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
        DepartmentDao departmentDao = new DepartmentDao();
        String page = request.getParameter("page");
        if(page == null){
            page = "departments";
            List<Department> departments = departmentDao.selectAll();
            request.setAttribute("departments", departments);
        } else if(page.equals("editDepartment")){
            Long departmentId = Long.valueOf(request.getParameter("departmentId"));
            Department department = departmentDao.select(departmentId);
            request.setAttribute("department", department);
        }
*/

    String forward = "";
    String page = request.getParameter("page");

        if (page != null)
            switch (page){
        case ACTION_DELETE:
            int itemId = Integer.parseInt(request.getParameter(PARAMETER_ENTITY_ID));
            dao.delete(itemId);
            forward = PAGE_LIST;
            request.setAttribute(ATTRIBUTE_LIST, dao.selectAll());
            break;
        case ACTION_EDIT:
            forward = PAGE_EDIT;
            Long id = Long.parseLong(request.getParameter(PARAMETER_ENTITY_ID));
            Department item = dao.select(id);
            request.setAttribute(ATTRIBUTE_ITEM, item);
            break;
        case ACTION_LIST:
            forward = PAGE_LIST;
            request.setAttribute(ATTRIBUTE_LIST, dao.selectAll());
            break;
        default:
            forward = PAGE_LIST;
            break;
    }
        request.getRequestDispatcher(page).forward(request,response);
    }

}




