import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class ChangeInfoListener implements ActionListener {
    private JFrame frame;
    private JTextField oldEmail;
    private JTextField name;
    private JPasswordField password;
    private JTextField tckn;
    QueryHandler handler = new QueryHandler();
    String sql;
    String newPassword;
    boolean changePassword;
    boolean changeName;
    boolean changeTckn;
    int x=0;

    public ChangeInfoListener(JPasswordField password,JTextField tckn,JTextField name, JTextField oldEmail){
        this.name = name;
        this.tckn = tckn;
        this.oldEmail = oldEmail;
        this.password = password;
        sql = "SELECT * FROM hms.patient WHERE email=\""+ oldEmail.getText() +"\";";
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("x at line 29: " + x);
        System.out.println(name.getText());
        if(isDifferent("p_Name", name.getText())){
            changeName = true;
            x++;System.out.println("x++ at line 32");
        }
        if(isPassword6char(password.getText()) && password.getText().length() != 0){
            newPassword = new PasswordHash(password.getText(),oldEmail.getText()).hash();
            if(isDifferent("hashpw", newPassword)){
                changePassword = true;
                x++;System.out.println("x++ at line 38");
            }
        }
        if(tckn.getText().length()>0){
            if(tckn.getText().length()!=11){
                JOptionPane.showMessageDialog(null,"Your TCKN must be 11 Characters");
                changePassword=changeName=changeTckn=false;
                x=0;
            }
            else{
                changeTckn = true;
            }
        }
        if(changeName){
            handler.connect();
            sql="UPDATE hms.patient SET p_Name='"+name.getText()+"' WHERE email=\"" + oldEmail.getText() +"\"";
            handler.handleQuery(sql);
        }
        if(changeTckn){
            handler.connect();
            sql="UPDATE hms.patient SET p_Tckn='"+tckn.getText()+"' WHERE email=\"" + oldEmail.getText() +"\"";
            handler.handleQuery(sql);
            tckn.setEditable(false);
        }
        if(changePassword){
            handler.connect();
            sql="UPDATE hms.patient SET hashpw='"+newPassword+"' WHERE email=\"" + oldEmail.getText() +"\"";
            handler.handleQuery(sql);
        }
        System.out.println("x at line 67: " + x);
        if(x>0)
            JOptionPane.showMessageDialog(null,"Your Info has been changed");
        x=0;
    }

    public boolean isDifferent(String column, String newStr){
        handler.connect();
        if(!(handler.getInfo(sql, column).equals(newStr))){
            return true;
        }
        return false;
    }

    public boolean isPassword6char(String s){
        if(s.length() < 6 && s.length() != 0){
            JOptionPane.showMessageDialog(null,"Password should be at least 6 characters");
            changePassword=changeName=changeTckn=false;
            x=0;
            return false;
        }
        else
            return true;
    }
}
