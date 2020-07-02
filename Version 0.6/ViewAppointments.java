import java.sql.*;


public class ViewAppointments {


    public ResultSet view(){
        QueryHandler handler = new QueryHandler();
        handler.connect();
        switch (LoginPage.role){
            case 3:
                try{
                Statement stmt = handler.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("SELECT * FROM make_appointments");
                return rs;
                }

                catch(Exception e){
                    e.printStackTrace();
                }



        }
        return null;
    }
}
