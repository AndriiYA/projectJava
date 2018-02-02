package main.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String HOST = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "root";
    private static final  String PASSWORD = "root";

    private static Connection conection;
    public Connection getConection() {
        return conection;
    }
    public static void main(String[]args){
         new FabricMySQLDriver();
        try {
            conection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
            if(!conection.isClosed()){
                System.out.println("Соединение с БД установленно!");
            }
            conection.close();
              if(conection.isClosed()){
                System.out.println("Соединение с БД закрыто!");
           }
        } catch (SQLException e) {
            System.out.println("Не удалось загрузить класс драйвера!");
        }


    }
}
