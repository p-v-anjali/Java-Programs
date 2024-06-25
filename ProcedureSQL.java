/*
DELIMITER //

CREATE PROCEDURE InsertDepartment (IN deptNo INT, IN deptName VARCHAR(255), IN deptLoc VARCHAR(255))
BEGIN
    INSERT INTO department (dno, dname, dloc) VALUES (deptNo, deptName, deptLoc);
END //

DELIMITER ;

 */
import java.sql.*;

public class ProcedureSQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/emp_db?characterEncoding=utf8";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            String procedureCall = "{CALL InsertDepartment(?, ?, ?)}"; // Adjusted for three parameters
            CallableStatement statement = connection.prepareCall(procedureCall);

            statement.setInt(1, 101);
            statement.setString(2, "Engineering");
            statement.setString(3, "Location"); // Adjusted for three parameters
            statement.execute();
            System.out.println("Records inserted successfully.");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error executing stored procedure: " + e.getMessage());
        }
    }
}
