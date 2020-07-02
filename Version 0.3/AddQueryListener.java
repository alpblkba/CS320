import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddQueryListener implements ActionListener {
    JFrame frame;
    JTextField name;
    JTextField pw;
    public AddQueryListener(JFrame frame, JTextField name, JTextField pw) {
        this.frame = frame;
        this.name = name;
        this.pw = pw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        QueryHandler handler = new QueryHandler();
        String q = "'"+name.getText()+"','"+pw.getText()+"'";
        handler.connect();
        handler.handleQuery("insert into doctor(d_Email,d_Hashpw) values("+q+")", "");
        JOptionPane.showMessageDialog(null,"BRUH");
        AdministratorPage aPage = new AdministratorPage();
    }


}

