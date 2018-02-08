package com.yaskov.common.DAO.Implementation;

import com.yaskov.common.DAO.DepartmentDao;
import com.yaskov.common.model.Department;
import com.yaskov.common.services.MySqlConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    private static String SQL_INSERT = "INSERT INTO department VALUES(?, ?);";
    private static String SQL_UPDATE = "UPDATE department set name=? where id=?";
    private static String SQL_SELECT = "SELECT * FROM department;";
    private static String SQL_DELETE = "delete from department;";
    private static String SQL_SELECT_BY_ID = "SELECT * FROM employce where id = ?;";
    private static String SQL_DELETE_BY_ID = "DELETE FROM employce WHERE id = ?;";

    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<Department>();
        MySqlConnection mySqlConnection = new MySqlConnection();

        try {
            Statement statement = mySqlConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECT);
            while (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt(1));
                department.setName(resultSet.getString(2));

                departments.add(department);
            }
        } catch (SQLException e) {
            System.out.println("Error get all departments: " + e.getMessage());
        }
        return departments;
    }

    public List<Department> addDepartment(int index,String name){
        MySqlConnection worker  = new MySqlConnection();
        String query = SQL_INSERT;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = worker.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, index);
            preparedStatement.setString(2, name);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return null;
    }






}
