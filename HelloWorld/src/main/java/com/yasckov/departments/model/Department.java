package com.yasckov.departments.model;

import java.util.List;

public class Department {

    private Integer id;
    private String name;
    private List<Employee> employees;


    public Integer getId(){

        return this.id;
    }

    public void setId(Integer id){

        this.id = id;
    }
    public List<Employee> getEmployees() {

        return employees;
    }

    public void setEmployees(List<Employee> employees) {

        this.employees = employees;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
