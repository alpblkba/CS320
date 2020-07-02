import com.mysql.jdbc.StreamingNotifiable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("deprecation")

public class TextFieldListener implements ActionListener{
    JFrame frame;
    JTextField name;
    JPasswordField password;
    JTextField tckn;
    JTextField email;
    String sql;
    QueryHandler handler = new QueryHandler();

    public TextFieldListener(JFrame frame,JTextField email , JPasswordField password, JTextField tckn, JTextField name){
        //for Register
        this.frame = frame;
        this.name = name;
        this.password = password;
        this.tckn = tckn;
        this.email = email;
    }

    public TextFieldListener(JFrame frame, JTextField email,JPasswordField password){
        //For Sign-In
        this.frame = frame;
        this.email = email;
        this.password = password;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        handler.connect();
        String emailInput = email.getText();
        String p = password.getText();
        if(isCorrectEmail(emailInput)){
            if(!(name == null))//If its register page
            {
                String tcknInput = tckn.getText();
                String nameInput = name.getText();
                if(isEmailExists(emailInput) && isCorrectTckn(tcknInput) && isPassword6char(p) && !isEmpty(nameInput)){
                    emailInput = "'" + emailInput + "'";
                    tcknInput = "'" + tcknInput + "'";
                    nameInput = "'" + nameInput + "'";

                    String passwordInput = new PasswordHash(p,email.getText()).hash();
                    passwordInput = "'" + passwordInput + "'";

                    if(tcknInput.equals("''")){
                        sql ="INSERT INTO hms.patient(p_Name, email, hashpw) " +
                                "VALUES("+
                                nameInput + "," +
                                emailInput + "," +
                                passwordInput + ");";
                    }
                    else {
                        sql = "INSERT INTO hms.patient(p_Tckn, p_Name, email, hashpw) " +
                                "VALUES(" +
                                tcknInput + "," +
                                nameInput + "," +
                                emailInput + "," +
                                passwordInput + ");";
                    }
                    if(handler.handleQuery(sql)){
                        frame.dispose();
                        JOptionPane.showMessageDialog(null,"You have registered");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Something bad happened!");
                    }
                }
            }
            else if(isPassword6char(p)) {//If its NOT register page
                emailInput = "'" + emailInput + "'";

                String passwordInput = new PasswordHash(p, email.getText()).hash();
                passwordInput = "'" + passwordInput + "'";

                sql = "SELECT * FROM hms." + tableName(LoginPage.role) + " WHERE email =" + emailInput;
                if (handler.handleQuery(sql, passwordInput.substring(1, passwordInput.length() - 1))) {
                    frame.dispose();
                    JOptionPane.showMessageDialog(null, "You have logged on");
                    if (LoginPage.role == 1){//If its patient-login page
                        Patientpage pPage = new Patientpage(email);
                    } else if (LoginPage.role == 2){//If its doctor-login page
                        DoctorPage dPage = new DoctorPage();
                    } else if (LoginPage.role == 3) {//If its admin-login page
                        AdministratorPage aPage = new AdministratorPage();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect email or password");
                }
            }
        }
    }

    public boolean isCorrectEmail(String email){
        int check=0;
        int check2=0;
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                check++;
                for(int j=i+1; j<email.length(); j++){
                    if(email.charAt(j) == '@')
                        check++;
                    else if(email.charAt(j) == '.')
                        check2++;
                }
            }
        }
        if(check == 1 && check2>0)
            return true;
        else{
            JOptionPane.showMessageDialog(null,"Enter a correct email");
            return false;
        }
    }

    public boolean isEmailExists(String email){
        sql="SELECT * FROM hms.patient WHERE email=\"" + email + "\"";
        if(handler.isEmailExists(sql, email)){
            JOptionPane.showMessageDialog(null,"User Exists");
            return false;
        }
        return true;
    }

    public boolean isPassword6char(String s){
        if(s.length() < 6){
            JOptionPane.showMessageDialog(null,"Password should be at least 6 characters");
            return false;
        }
        else
            return true;
    }

    public boolean isCorrectTckn(String s){
        if(s.length() == 11 || s.length() == 0)
            return true;
        JOptionPane.showMessageDialog(null,"TCKN should be at least 11 characters");
        return false;
    }

    public boolean isEmpty(String s){
        if(s.length() != 0)
            return false;
        JOptionPane.showMessageDialog(null,"Enter your name");
        return true;
    }

    public String tableName(int role){
        if (role == 1){//If its patient-login page
            return "patient";
        } else if (role == 2){//If its doctor-login page
            return "doctor";
        } else {//If its admin-login page
            return "administrator";
        }
    }
}
