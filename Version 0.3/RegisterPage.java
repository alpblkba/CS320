import java.awt.*;

import javax.swing.*;

public class RegisterPage {
    private JFrame frame;
    private JTextField email;
    private JPasswordField password;
    private JTextField tckn;
    private JTextField name;

    /**
     * Launch the application.
     */
    /**
     * Create the application.
     */
    public RegisterPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Register Page");
        label.setForeground(Color.MAGENTA);
        label.setBounds(150, 7, 150, 75);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 15));
        frame.getContentPane().add(label);

        JLabel lblemail = new JLabel("E-Mail");
        lblemail.setBounds(82, 52, 68, 27);
        frame.getContentPane().add(lblemail);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(82, 117, 68, 27);
        frame.getContentPane().add(lblPassword);

        JLabel lblTckn = new JLabel("TCKN (Optional)");
        lblTckn.setBounds(82, 175, 150, 27);
        frame.getContentPane().add(lblTckn);

        JLabel nameLbl = new JLabel("Name");
        nameLbl.setBounds(82, 220, 150, 27);
        frame.getContentPane().add(nameLbl);

        email = new JTextField();
        email.setBounds(199, 55, 96, 20);
        frame.getContentPane().add(email);
        email.setColumns(10);

        password = new JPasswordField();
        password.setEchoChar('*');
        password.setBounds(199, 110, 96, 20);
        frame.getContentPane().add(password);
        password.setColumns(10);

        tckn = new JTextField();
        tckn.setBounds(199, 175, 96, 20);
        frame.getContentPane().add(tckn);
        tckn.setColumns(10);

        name = new JTextField();
        name.setBounds(199, 220, 96, 20);
        frame.getContentPane().add(name);
        name.setColumns(10);

        JButton register = new JButton("Register");
        register.addActionListener(new TextFieldListener(frame, email, password, tckn, name));
        register.setBounds(199, 250, 87, 23);
        frame.getContentPane().add(register);
        frame.setVisible(true);
    }
}
