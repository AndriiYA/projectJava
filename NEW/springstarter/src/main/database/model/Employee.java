package main.database.model;

import java.util.Date;

public class Employee extends BaseModel {

    private  String name;
    private int age;
    private String email;
    private int phoneNumber;
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName(String string) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int anInt) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail(String string) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +"name='" + name + '\'' +", age=" + age + ", email='" + email + '\'' +", phoneNumber=" + phoneNumber +
                ", birthday=" + birthday +'}';
    }
}
