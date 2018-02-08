package com.yaskov.common.controllers;

import com.yaskov.common.DAO.DepartmentDao;
import com.yaskov.common.DAO.Implementation.DepartmentDaoImpl;
import com.yaskov.common.model.Department;
import com.yaskov.common.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView printHello() {
        ModelAndView m = new ModelAndView();
        m.setViewName("departments");
        DepartmentDao departmentDao = new DepartmentDaoImpl();
        List<Department> allDepartments = departmentDao.getAllDepartments();
        m.addObject("allDepartments", allDepartments);
        return m;
    }

    @RequestMapping(value = "department", method = RequestMethod.GET)
    public ModelAndView developer() {
        System.out.println("m1");
        return new ModelAndView("department", "command", new Department());
    }

    @RequestMapping(value = "/addDepartment", method = RequestMethod.POST)
    public String addDepartment(@ModelAttribute("department") Department department, ModelMap model) {
        System.out.println("m2 " + department);
        new DepartmentDaoImpl().addDepartment(department.getId(), department.getName());

        return "/";
    }



}
