import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseForJdbc", "root", "mysql@872Z");
    Statement st = con.createStatement();
        String query = "INSERT INTO students VALUES (7, 'gopal'),(8,'balkrishna')";
//    ResultSet rs = st.executeQuery(query); //DQL-data query language returns object
        int count= st.executeUpdate(query);



//    while (rs.next()) {
//        String name = rs.getString(2) + " " + rs.getInt("id");
//        System.out.println(name);
//    }
        System.out.println(count);
st.close();
    con.close();
    }
}