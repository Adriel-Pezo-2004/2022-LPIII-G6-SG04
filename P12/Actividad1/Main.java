/*

import java.sql.*; 

class InsertPrepared {

    public static void main(String args[]) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3307/ucsm", "root", "root");
            PreparedStatement stmt = con.prepareStatement("insert into alumnos values(?,?,?)");
            stmt.setString(1, "Paolo");
            stmt.setString(2, "2021");
            stmt.setString(3, "Ciencias Formales");
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
*/
