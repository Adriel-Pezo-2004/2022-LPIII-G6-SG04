/*
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider; 



public class RowSet {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
    
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3307/ucsm");
        rowSet.setUsername("root");
        rowSet.setPassword("root");
        rowSet.setCommand("select * from alumno");
        rowSet.execute();


    while (rowSet.next()) {
        // Generating cursor Moved event
        System.out.println("código de matrícula: " + rowSet.getString(1));
        System.out.println("nombre y apellidos: " + rowSet.getString(2));
        System.out.println("facultad: " + rowSet.getString(3));

        }
    }

}



*/