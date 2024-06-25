import java.sql.*;

public class TransactionManagementS {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8",
                    "root",
                    "");
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            String insertQuery = "INSERT INTO Department (dno, dname, dloc) VALUES (102, 'HR', 'Kottayam')";
            stmt.executeUpdate(insertQuery);

            String updateQuery = "UPDATE Department SET dname = 'Human Resources' WHERE dno = 102";
            stmt.executeUpdate(updateQuery);

            String deleteQuery = "DELETE FROM Department WHERE dno = 102";
            stmt.executeUpdate(deleteQuery);

            conn.commit();
            System.out.println("Transaction committed successfully.");
        } catch (Exception e) {

            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("Transaction rolled back successfully.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {

            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
