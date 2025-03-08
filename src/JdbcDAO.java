import java.sql.*;



public class JdbcDAO {
    public static void main(String[] args) throws Exception {
        StudentDAO dao = new StudentDAO();

        Student student = dao.getStudent(2);
        System.out.println(student.name);
    }

}
class StudentDAO{
    public Student getStudent(int id) throws Exception {
        Student student=new Student();
        student.id=id;
    Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseForJdbc", "root", "mysql@872Z");
        String query="select * from students where id="+id;
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        String nameVar =rs.getString("name");
        student.name=nameVar;
        return student;
    }

}
class Student{
    int id;
    String name;
}
