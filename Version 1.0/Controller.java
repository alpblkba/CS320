import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Controller {

    String sql;
    public void addAdmin(){
            sql = "INSERT INTO administrator(a_Hashpw, a_Email) " +
                    "VALUES('12345678', 'emrekarakuz@gmail.com')";
            //Should be taken as input
            //Hash value of password
            //e-mail should be checked before
            /*
            try {
                stmt.executeUpdate(sql);
            }
            catch(Exception e){
                e.printStackTrace();
            }

            */
    }
    public void addDoctor(){
        sql= "INSERT INTO doctor(d_Name, d_Email, d_Hashpw, departmentName) " +
                "VALUES('Emre Karakuz', 'emrekarakuz@gmail.com', '12345678', 'Cardiology')";
        //Should be taken as input
        /*
        try {
            stmt.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        */
    }

    public void addPatient(String name, String password, String email, String tckn){
        sql= "INSERT INTO hms.patient(p_Tckn, p_Name, p_Email, p_Hashpw) " +
                "VALUES("+
                tckn + "," +
                name + "," +
                email + "," +
                password + ");";
        //Should be taken as input
        //Hash value of password
        //TCKN and e-mail should be checked before

        /*
        System.out.println(sql);
        try {
            stmt.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        */
    }

    public void login(String email, String password){

    }



    /*Check Functions*/

}
    class removeDoctor implements ActionListener{
        public void actionPerformed(ActionEvent a){

        }
    }



