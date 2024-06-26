import java.sql.*;

public class SQLExceptionExample {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception er) {
            System.out.println(er);
        }
        try {

            // Connect to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8",
                    "root",
                    "");

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM sreekesh");

            SQLWarning warning = conn.getWarnings();
            if (warning != null) {
                System.out.println("SQLWarning:");
                while (warning != null) {
                    System.out.println("Message: " + warning.getMessage());
                    System.out.println("SQL State: " + warning.getSQLState());
                    System.out.println("Vendor Code: " + warning.getErrorCode());
                    warning = warning.getNextWarning();
                }
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println("SQLException:");
            System.err.println("Message: " + e.getMessage());
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Vendor Code: " + e.getErrorCode());
            e.printStackTrace();
        }
    }
}
