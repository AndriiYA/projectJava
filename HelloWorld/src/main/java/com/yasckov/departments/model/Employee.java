package com.yasckov.departments.model;

import java.util.Date;

public class Employee implements Comparable<Employee>{
    public static final String LIST = "eployeers";
    public static final String ITEM = "employee";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_ID = "name";
    public static final String FIELD_AGE = "name";
    public static final String FIELD_EMAIL = "name";
    public static final String FIELD_PHONE_NUMBER = "name";
    public static final String FIELD_BIRTHDAY = "name";

    private  String name;
    private Integer id;
    private Integer age;
    private String email;
    private Integer phoneNumber;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", birthday=" + birthday +
                '}';
    }


    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    public boolean isNew(){
        return id==null;
    }
}
