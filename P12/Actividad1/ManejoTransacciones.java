import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ManejoTransacciones {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ucsm", "root", "root");

            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into alumno values(2021246391,'Paolo Rivera Salas','Ciencias e Ingenierías Físicas y Formales')");
            stmt.executeUpdate("insert into alumno values(2021483485,'Deyner Cuadros Flores','Ciencias e Ingenierías Físicas y Formales')");
            stmt.executeUpdate("insert into alumno values(2021506593,'Adriel Pezo Vizcarra','Ciencias e Ingenierías Físicas y Formales')");
            
            con.commit();
            
            
            System.out.println("3 registros insertados con ÉXITO");
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}