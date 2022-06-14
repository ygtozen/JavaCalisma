
import java.sql.*;

public class DbHelper {
     private String userName = "root";
    private String password = "12345";
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    // "jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    // "jdbc:mysql://localhost:3306/world"
    // "jdbc:mysql://localhost:3306/world"
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, userName, password);
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("Erro Message : " + exception.getMessage());
        System.out.println("Error Code : " + exception.getErrorCode());
    }
}
