import java.sql.*;

public class ResultDAO {

    // Insert Result
    public void addResult(Result r) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO result VALUES(?,?,?)");
        ps.setInt(1, r.getStudentId());
        ps.setInt(2, r.getMarks());

        // Auto grade
        String grade = r.getMarks() >= 90 ? "A" :
                       r.getMarks() >= 75 ? "B" :
                       r.getMarks() >= 50 ? "C" : "F";

        ps.setString(3, grade);
        ps.executeUpdate();
        System.out.println("Result Added!");
    }

    // View Results
    public void viewResults() throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM result");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " | " + rs.getInt(2) + " | " + rs.getString(3));
        }
    }
}
