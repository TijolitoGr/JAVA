package pkg5.pkg002_db_consola;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
            
        String host = "jdbc:mysql://localhost:3306/teste_java";
        String userName = "user123";
        String userPass = "System32";
            
        try {
            Connection conn = DriverManager.getConnection(host, userName, userPass);
            
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); 
            
            String SQL = "SELECT * FROM tabela";
            
            ResultSet result = stmt.executeQuery(SQL);
            
            while (result.next()) {
                int id_teste = result.getInt("id_teste");
                String teste_varchat = result.getString("teste_varchat");
                String teste_int = result.getString("teste_int");
                System.out.println("ID_TESTE: " + id_teste + " /// TESTE_VARCHAT: " + teste_varchat + " /// TESTE_INT: " + teste_int);
            }
            
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }    
}
