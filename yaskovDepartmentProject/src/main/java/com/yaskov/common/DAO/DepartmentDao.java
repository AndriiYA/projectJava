package com.yaskov.common.DAO;

import com.yaskov.common.model.Department;

import java.util.List;

public interface DepartmentDao {

    public List<Department> getAllDepartments();
    public List<Department> addDepartment(int index, String name);


}
