package com.andrii.project.Dao;

import com.andrii.project.model.Department;
import com.andrii.project.services.MySqlConnector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDao{

    private static String SQL_INSERT = "INSERT INTO department VALUES(?, ?);";
    private static String SQL_UPDATE = "UPDATE department set name=? where id=?";
    private static String SQL_SELECT = "SELECT * FROM department;";
    private static String SQL_DELETE = "delete from department;";
    private static String SQL_SELECT_BY_ID = "SELECT * FROM department where id = ?;";
    private static String SQL_DELETE_BY_ID = "DELETE FROM department WHERE id = ?;";



    public boolean delete(long id) {
        MySqlConnector worker = new MySqlConnector();
        try {
            PreparedStatement st = null;
            st = worker.getConnection().prepareStatement(SQL_DELETE_BY_ID);
            st.setLong(1, id);
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean deleteAll(){
        try{
            MySqlConnector worker = new MySqlConnector();
            PreparedStatement st = worker.getConnection().prepareStatement(SQL_DELETE);
            int n = st.executeUpdate();
            if(n==0){
                return false;
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }


    public Department select(Long id){
        Department item = null;
        Department department = new Department();
        MySqlConnector worker = new MySqlConnector();
        try {
            PreparedStatement preparedStatement = worker.getConnection().prepareStatement(SQL_SELECT_BY_ID);
            preparedStatement.setLong(1,id);
            ResultSet result = preparedStatement.executeQuery();
            if(result.next()){
                department.setId(result.getLong("id"));
                department.setName(result.getString("name"));

            }
           // if (id == null){
         //       System.out.println("Exception");
         //   }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(department);
        return department;
    }

    //work
    public List<Department> selectAll() {
        List<Department> departments = new ArrayList<Department>();
        MySqlConnector worker = new MySqlConnector();

        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);
            while (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getLong(1));
                department.setName(resultSet.getString(2));
                departments.add(department);
            }
        } catch (SQLException e) {
            System.out.println("Error get all departments: " + e.getMessage());
        }
        System.out.println(departments);
        return departments;
    }

    //work
    public List<Department> addDepartment(int index,String name){
        MySqlConnector worker  = new MySqlConnector();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = worker.getConnection().prepareStatement(SQL_INSERT);
            preparedStatement.setInt(1, index);
            preparedStatement.setString(2, name);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateDepartment(Department department){
        MySqlConnector worker = new MySqlConnector();
        try{
            PreparedStatement preparedStatement = worker.getConnection().prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1,department.getName());
            preparedStatement.setLong(1,department.getId());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
