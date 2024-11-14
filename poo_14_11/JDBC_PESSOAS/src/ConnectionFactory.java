import java.sql.*;
public class ConnectionFactory {
    //string de conexão
    //jbdc:posthresql://localhost:5432/pessoa
    //exemplo: https://www.google.com:80/search
    private static final String HOST = "localhost";
    private static final String PORT = "5432";
    private static final String DB = "20242_fatec_ipi_poo_pessoas_v2";
    private static final String USER = "postgres";
    //pesquisar pela classe
    private static final String PASSWORD = "123456";
    public static Connection conectar(){
        try {
            var s = String.format(
                "jdbc:postgresql://%s:%s/%s",
                HOST, PORT, DB
                );
                Connection c = DriverManager.getConnection(s,USER, PASSWORD);
                return c;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

