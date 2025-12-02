import java.sql.*; 
import java.util.*;

public class StudentDAO {

    // Insert Student
    public void addStudent(Student s) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
        ps.setInt(1, s.getStudentId());
        ps.setString(2, s.getName());
        ps.setString(3, s.getCourse());
        ps.executeUpdate();
        System.out.println("Student Added Successfully!");
    }

    // Read All Students
    public void viewStudents() throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
        }
    }

    // Update Student
    public void updateStudent(int id, String newName) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
                "UPDATE student SET name=? WHERE studentId=?");
        ps.setString(1, newName);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Student Updated!");
    }

    // Delete
    public void deleteStudent(int id) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE studentId=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Student Deleted!");
    }
}
