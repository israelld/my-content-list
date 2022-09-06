package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbx:mysql://localhost:3306/listApp";
    public static final String USER = "root";
    public static final String PASS = "root";

    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        }catch(Exception ex){
            throw new RuntimeException("Erro na conexão com o banco de dados!");
        }
    }
    public static void closeConnection(Connection connection){
        try {
            if(connection != null){
                connection.close();
            }

        }catch (Exception ex){
            throw new RuntimeException("Erro ao fechar conexão com o banco de dados!");
        }
    }

}
