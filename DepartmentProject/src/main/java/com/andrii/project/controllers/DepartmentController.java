package com.andrii.project.controllers;

import com.andrii.project.Dao.DepartmentDao;
import com.andrii.project.model.Department;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DepartmentController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/departmen.jsp";
    private static String LIST_DEPARTMENT = "/listDepartment.jsp";
    private DepartmentDao dao;

    public DepartmentController(){
        super();
        dao = new DepartmentDao();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Department department = new Department();
        department.setName(request.getParameter("name"));
        department.setId(Long.valueOf(request.getParameter("departmentId")));
        String departmentId = request.getParameter("departmentId");


        RequestDispatcher view = request.getRequestDispatcher(LIST_DEPARTMENT);
        request.setAttribute("departments", dao.selectAll());
        view.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  String forward = "";
        String action = request.getParameter("action");

        if(action.equalsIgnoreCase("delete")){
            Long deparmentId = Long.parseLong(request.getParameter("departmentId"));
            dao.delete(deparmentId);
            forward = LIST_DEPARTMENT;
            request.setAttribute("departments", dao.selectAll());
        }else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            Long departmentId = Long.parseLong(request.getParameter("departmentId"));
            Department department = dao.select(departmentId);
            request.setAttribute("department", department);
        }else if (action.equalsIgnoreCase("listDepartment")){
            forward = LIST_DEPARTMENT;
            request.setAttribute("departments", dao.selectAll());
        }else{
            forward = INSERT_OR_EDIT;
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request,response);

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
        */
    }

}




