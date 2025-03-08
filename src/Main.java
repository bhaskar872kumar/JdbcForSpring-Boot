import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {

//    Class.forName("com.mysql.cj.jdbc.Driver");
//    Here instead of above code we can we can explicitly use the below  code since



    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseForJdbc", "root", "mysql@872Z");
    PreparedStatement ps = con.prepareStatement("insert into students values(?,?)");
    ps.setInt(1,334);
    ps.setString(2,"Diwakar Chauhan");
        System.out.println(ps.executeUpdate());
    ps.close();
    con.close();
    }
}