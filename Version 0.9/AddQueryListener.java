import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddQueryListener implements ActionListener {
    JFrame frame;
    JTextField email;
    JTextField pw;
    JTextField name;
    JTextField department;

    
    public AddQueryListener(JFrame frame, JTextField email, JTextField pw, JTextField name, JTextField department) {
        this.frame = frame;
        this.email = email;
        this.pw = pw;
        this.name = name;
        this.department = department;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        QueryHandler handler = new QueryHandler();

        String p = pw.getText();
        String passwordInput = new PasswordHash(p,email.getText()).hash();

        String q = "'"+ name.getText() +"','"+ email.getText()+"','"+ passwordInput+"','"+ department.getText()+"'";
        handler.connect();
        try {
            handler.stmt.executeUpdate("INSERT INTO hms.doctor(d_Name,email,hashpw,departmentName) values(" + q + ")");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,"Doctor Added");
        AdministratorPage aPage = new AdministratorPage();
    }


}

