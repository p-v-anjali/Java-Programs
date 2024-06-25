import java.sql.*;

public class DeletePS {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8",
                    "root", "");
            PreparedStatement st = con.prepareStatement("Delete from emp where esal < ?");
            st.setInt(1, 10000);
            int i = st.executeUpdate();
            System.out.println(i + " record delete");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
