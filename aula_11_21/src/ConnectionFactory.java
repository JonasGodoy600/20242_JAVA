import java.sql.*;
public class ConnectionFactory {
    //string de conexão
    //jdbc: postgresql://localhost:5432/pessoas
    //exemplo: https://www.google.com:80/search
    private static final String HOST = "localhost";
    private static final String PORT = "5432";
    private static final String DB = "db_pessoa";
    private static final String USER = "postgres";
    //pesquisar pela classe Properties do pacote java.util
    //assim q vc resolve a questão da senha chumbada no código
    private static final String PASSWORD = "123456";

    public static Connection conectar(){
       try{
        var s = String.format(
            "jdbc:postgresql://%s:%s/%s",
               HOST, PORT, DB
           );
           Connection c = DriverManager.getConnection(
               s, USER, PASSWORD
           );
           return c;
       }
       catch(Exception e){
        e.printStackTrace();
        return null;
       }
    }
}
