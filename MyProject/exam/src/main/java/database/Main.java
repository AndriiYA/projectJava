package database;

import Model.Employee;

import java.sql.*;
import java.sql.SQLException;
import java.util.Calendar;

public class Main {

    public static void showAll() {
        DbWorker worker = new DbWorker();
        String query = "SELECT * FROM employce"; // Вывести всех из таблицы
        try {
            Statement statement = worker.getConection().createStatement();
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
        DbWorker worker  = new DbWorker();
        String query = "INSERT INTO employce VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = worker.getConection().prepareStatement(query);
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

    public static void remove (int id) {
        DbWorker worker = new DbWorker();
        String query = "DELETE FROM employce WHERE id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = worker.getConection().prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static  void main(String[]args){

showAll();
remove(3);
remove(6);
showAll();

    }
}
