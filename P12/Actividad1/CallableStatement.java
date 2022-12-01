
/*
import java.sql.*;


class CallableStatement {

    public static void main(String args[]) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/ucsm", "root", "root");
            CallableStatement stmt=con.prepareCall("{call p_mostrar()}");
            System.out.println("Ejecutado con ÉXITO");
                 
            stmt.execute();


        } catch (Exception e) {

            System.out.println(e);

        }
    }
}  
*/

