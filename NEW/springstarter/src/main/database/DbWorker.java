package main.database;


import java.sql.Connection;

public class DbWorker {
    private static final String HOST = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "root";
    private static final  String PASSWORD = "root";

    private Connection conection;

    public DbWorker (){

    }

}
