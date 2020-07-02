import javax.swing.*;
import java.sql.*;

public class QueryHandler {
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;

    public boolean connect() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "Hektor*3261");
            stmt = conn.createStatement();
            System.out.println("Connected!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problem!");

        }

        //cont.addDoctor();
        //cont.addPatient();
        return true;

    }
    public boolean handleQuery(String query, String password){
        //System.out.println(password);
        //System.out.println(password.equals(""));
        if(password.equals("")){
            try{
                stmt.executeUpdate(query);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            try (ResultSet rs = stmt.executeQuery(query)) {System.out.println("line38");
                //System.out.println(rs.next());
                if(rs.next()){//System.out.println(rs.getString("p_Hashpw") + ", " + password);
                    if(rs.getString("p_Hashpw").equals(password)){//System.out.println("line40");
                        System.out.println(query + "\n" + rs.getString("p_Hashpw"));
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error");
            return false;
        }System.out.println("line59");
        return true;
    }

    /*
    public boolean getPassword(String query, String password){
        try (ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                if(rs.getString("p_Hashpw").equals(password)){
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        return false;
    }

     */
}
