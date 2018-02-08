
package com.yaskov.common.DAO;
/*
import com.yaskov.common.model.Employee;
import com.yaskov.common.services.MySqlConnection;

import java.sql.*;
import java.sql.SQLException;

public class EmployeeDAO {

    private static String SQL_INSERT = "INSERT INTO employce VALUES(?, ?, ?, ?, ?, ?);";
    private static String SQL_UPDATE = "UPDATE employce set name=?, age=?, email =?, phoneNumber =?, birthday =? where id=?";
    private static String SQL_SELECT = "SELECT * FROM employce;";
    private static String SQL_DELETE = "delete from employce;";
    private static String SQL_SELECT_BY_ID = "SELECT * FROM employce where id = ?;";
    private static String SQL_DELETE_BY_ID = "DELETE FROM employce WHERE id = ?;";


    public static void showAll() {
        MySqlConnection worker = new MySqlConnection();
        String query = SQL_SELECT; // Вывести всех из таблицы
        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Employee employees = new Employee();
                employees.setName(resultSet.getString(2));
                employees.setAge(resultSet.getInt(3));
                employees.setEmail(resultSet.getString(4));
                employees.setPhoneNumber(resultSet.getInt(5));
                employees.setBirthday(resultSet.getDate(6));
                System.out.println(employees);
            }
        }catch (SQLException e){
            System.out.println(e.fillInStackTrace());

        }
    }
    public static void add(int id, String name, int age, String email, int phoneNumber, String birthday){
        MySqlConnection worker  = new MySqlConnection();
        String query = SQL_INSERT;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = worker.getConnection().prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4,email);
            preparedStatement.setInt(5, phoneNumber);
            preparedStatement.setDate(6, Date.valueOf(birthday));
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteById(int id) {
        MySqlConnection worker = new MySqlConnection();
        String query = SQL_DELETE_BY_ID;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = worker.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean deleteAll() {
        try {
            MySqlConnection worker = new MySqlConnection();
            PreparedStatement st = worker.getConnection().prepareStatement(SQL_DELETE);
            int n = st.executeUpdate();
            if (n == 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static  void main(String[]args){

        add(1,"V1",23,"gitler@com",89342342,"1982-10-08");
        add(3,"V2",23,"gitler@com",89342342,"1982-10-08");
        add(4,"V3",23,"gitler@com",89342342,"1982-10-08");
        add(5,"V4",23,"gitler@com",89342342,"1982-10-08");
        showAll();
        deleteAll();
        showAll();
        add(1,"V1",23,"gitler@com",89342342,"1982-10-08");
        add(3,"V2",23,"gitler@com",89342342,"1982-10-08");
        add(4,"V3",23,"gitler@com",89342342,"1982-10-08");
        add(5,"V4",23,"gitler@com",89342342,"1982-10-08");
        deleteById(4);
        showAll();

    }
}
*/
