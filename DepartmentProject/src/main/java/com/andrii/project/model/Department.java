package com.andrii.project.model;

import java.util.List;

public class Department {
    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";

    private Long id;
    private String name;
    private List<Employee> employees;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name){
    this.name = name;
    }

    public List<Employee> getEmployees() {

    return employees;
    }

    public void setEmployees(List<Employee> employees) {

    this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                ']';
    }
}
