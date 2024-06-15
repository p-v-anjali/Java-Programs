import java.sql.*;  

class FetchRecords {  
    public static void main(String args[]) {  
        Connection con = null;
        Statement stmt = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laravel_curd?characterEncoding=utf8", "root", "");
            con.setAutoCommit(false);
            
            stmt = con.createStatement();
            
            stmt.executeUpdate("INSERT INTO user420 (id, name, salary) VALUES (190, 'abhi', 40000)");
            stmt.executeUpdate("INSERT INTO user420 (id, name, salary) VALUES (191, 'umesh', 50000)");
            
            con.commit();
            
            System.out.println("Records inserted successfully.");
        } catch (SQLException e) {
            if (con != null) {
                try {
                    con.rollback();
                    System.out.println("Transaction rolled back.");
                } catch (SQLException ex) {
                    System.out.println("Error rolling back transaction: " + ex.getMessage());
                }
            }
            System.out.println("Error executing SQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println("Error closing statement: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}
