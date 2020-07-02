import java.awt.*;

import javax.swing.*;

public class LoginPage {
    public static int role;
    private JFrame frame;
    private JTextField username;
    private JPasswordField password;

    /**
     * Launch the application.
     */
    /**
     * Create the application.
     */
    public LoginPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Login Page");
        label.setForeground(Color.blue);
        label.setBounds(82,25,150,75);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 15));
        frame.getContentPane().add(label);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(82, 79, 68, 27);
        frame.getContentPane().add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(82, 134, 68, 27);
        frame.getContentPane().add(lblPassword);

        username = new JTextField();
        username.setBounds(199, 82, 96, 20);
        frame.getContentPane().add(username);
        username.setColumns(10);

        password = new JPasswordField();
        password.setEchoChar('*');
        password.setBounds(199, 137, 96, 20);
        frame.getContentPane().add(password);
        password.setColumns(10);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new TextFieldListener(frame, username, password));
        //btnLogin.addActionListener(new LoginListener(frame));
        btnLogin.setBounds(199, 201, 87, 23);
        frame.getContentPane().add(btnLogin);
        frame.setVisible(true);
    }
}
