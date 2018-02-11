package dao;

import model.Employee;
import util.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    private Connection connection;

    public EmployeeDao() {
        connection = DbUtil.getConnection();
    }

    public void addEmployee(Employee employee) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into EmployeesDB(firstname,lastname,dob,email) values (?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setDate(3, new Date(employee.getDob().getTime()));
            preparedStatement.setString(4, employee.getEmail());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deleteEployee(int employeeId) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from EmployeesDB where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, employeeId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(Employee employee) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update EmployeesDB set firstname=?, lastname=?, dob=?, email=?" +
                            "where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setDate(3, new java.sql.Date(employee.getDob().getTime()));
            preparedStatement.setString(4, employee.getEmail());
            preparedStatement.setInt(5, employee.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from EmployeesDB");
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("userid"));
                employee.setFirstName(rs.getString("firstname"));
                employee.setLastName(rs.getString("lastname"));
                employee.setDob(rs.getDate("dob"));
                employee.setEmail(rs.getString("email"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public Employee getEmployeeById(int userId) {
        Employee employee = new Employee();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from EmployeesDB where id=?");
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                employee.setId(rs.getInt("id"));
                employee.setFirstName(rs.getString("firstname"));
                employee.setLastName(rs.getString("lastname"));
                employee.setDob(rs.getDate("dob"));
                employee.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employee;
    }
    }


