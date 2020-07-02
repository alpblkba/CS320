import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class LoginPage {
    public static int role;
    public static String current_email;
    private JFrame frame;
    private JTextField email;
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

        JLabel lblemail = new JLabel("E-Mail");
        lblemail.setBounds(82, 79, 68, 27);
        frame.getContentPane().add(lblemail);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(82, 134, 68, 27);
        frame.getContentPane().add(lblPassword);

        email = new JTextField();
        email.setBounds(199, 82, 96, 20);
        frame.getContentPane().add(email);
        email.setColumns(10);

        password = new JPasswordField();
        password.setEchoChar('*');
        password.setBounds(199, 137, 96, 20);
        frame.getContentPane().add(password);
        password.setColumns(10);

        JButton btnLogin = new JButton("Login");
        JButton btnBack = new JButton();
        btnBack.setBounds(0,0,70,50);
        btnBack.setBackground(Color.orange);
        try {
            Image img = ImageIO.read(getClass().getResource("icons8-go-back-64.png"));
            btnBack.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        btnBack.addActionListener(new backToMainListener(frame));
        btnLogin.addActionListener(new TextFieldListener(frame, email, password));
        //btnLogin.addActionListener(new LoginListener(frame));
        btnLogin.setBounds(199, 201, 87, 23);
        frame.getRootPane().setDefaultButton(btnLogin);
        frame.getContentPane().add(btnBack);
        frame.getContentPane().add(btnLogin);
        frame.setVisible(true);
    }
}
