package database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class DbWorker {
    private static final String HOST = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "root";
    private static final  String PASSWORD = "root";

    private Connection conection;

    public Connection getConection() {
        return conection;
    }

    public DbWorker(){
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            conection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
            if(!conection.isClosed()){
                System.out.println("Соединение с БД установленно!");
            }
           // conection.close();
          //  if(conection.isClosed()){
            //    System.out.println("Соединение с БД закрыто!");
          //  }
        } catch (SQLException e) {
            System.out.println("Не удалось загрузить класс драйвера!");
        }



    }
}
