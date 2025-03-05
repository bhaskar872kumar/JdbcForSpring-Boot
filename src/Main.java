import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseForJdbc", "root", "mysql@872Z");
    PreparedStatement ps = con.prepareStatement("insert into students values(?,?)");
    ps.setInt(1,34);
    ps.setString(2,"Diwakar");
        System.out.println(ps.executeUpdate());
    ps.close();
    con.close();
    }
}