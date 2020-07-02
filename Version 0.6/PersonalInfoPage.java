import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class PersonalInfoPage{
    private JFrame frame;
    private JTextField oldEmail;
    private JTextField email;
    private JPasswordField password;
    private JTextField tckn;
    private JTextField name;
    QueryHandler handler = new QueryHandler();

    /**
     * Launch the application.
     */
    /**
     * Create the application.
     */
    public PersonalInfoPage(JTextField email) {
        this.oldEmail = email;
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.getContentPane().setBackground(Color.cyan);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Personal Info");
        label.setForeground(Color.blue);
        label.setBounds(150, 1, 150, 75);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 15));
        frame.getContentPane().add(label);

        JLabel lblemail = new JLabel("E-Mail");
        lblemail.setBounds(82, 52, 68, 27);
        frame.getContentPane().add(lblemail);

        JLabel lblPassword = new JLabel("New Password");
        lblPassword.setBounds(82, 107, 150, 27);
        frame.getContentPane().add(lblPassword);

        JLabel lblTckn = new JLabel("TCKN");
        lblTckn.setBounds(82, 162, 150, 27);
        frame.getContentPane().add(lblTckn);

        JLabel nameLbl = new JLabel("Name");
        nameLbl.setBounds(82, 217, 150, 27);
        frame.getContentPane().add(nameLbl);

        email = new JTextField();
        email.setText(setInfo("email"));
        email.setEditable(false);
        email.setBounds(199, 55, 160, 20);
        frame.getContentPane().add(email);
        email.setColumns(10);

        password = new JPasswordField();
        password.setEchoChar('*');
        password.setBounds(199, 110, 160, 20);
        frame.getContentPane().add(password);
        password.setColumns(10);

        tckn = new JTextField();
        tckn.setText(setInfo("p_Tckn"));
        tckn.setDocument(new JTextFieldLimit(11));
        tckn.setBounds(199, 165, 160, 20);
        if(tckn.getText().length() !=0 )
            tckn.setEditable(false);
        frame.getContentPane().add(tckn);
        tckn.setColumns(10);

        name = new JTextField();
        name.setText(setInfo("p_Name"));
        name.setBounds(199, 220, 160, 20);
        frame.getContentPane().add(name);
        name.setColumns(10);

        JButton change = new JButton("Save Changes");
        change.addActionListener(new ChangeInfoListener(password,tckn,name,oldEmail));
        change.setBounds(202, 250, 150, 23);
        frame.getContentPane().add(change);

        JButton backbutton = new JButton();
        backbutton.setBounds(0,0,73,73);
        try {
            Image img = ImageIO.read(getClass().getResource("backmainb.png"));
            backbutton.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println(e);
        }
        backbutton.addActionListener(new backToPatientPageListener(frame,email));
        frame.getContentPane().add(backbutton);

        frame.setVisible(true);
    }

    public String setInfo(String column){
        String sql = "SELECT * FROM hms.patient WHERE email=\""+ oldEmail.getText() +"\";";
        handler.connect();
        return handler.getInfo(sql, column);
    }


}
