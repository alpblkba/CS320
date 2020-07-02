import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class RemoveDoctorPage {
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
    public RemoveDoctorPage() {
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

        JLabel label = new JLabel("Remove a Doctor");
        label.setForeground(Color.blue);
        label.setBounds(82,15,150,75);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 15));
        frame.getContentPane().add(label);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(82, 79, 68, 27);
        frame.getContentPane().add(lblUsername);

        username = new JTextField();
        username.setBounds(199, 82, 96, 20);
        frame.getContentPane().add(username);
        username.setColumns(10);

        JButton removeDoctor = new JButton("Remove");
        removeDoctor.addActionListener(new RemoveQueryListener(frame));
        removeDoctor.setBounds(199, 160, 87, 23);
        frame.getContentPane().add(removeDoctor);

        JButton btnBack = new JButton();
        btnBack.setBounds(0,0,70,50);
        btnBack.setBackground(Color.orange);
        try {
            Image img = ImageIO.read(getClass().getResource("icons8-go-back-64.png"));
            btnBack.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        btnBack.addActionListener(new backToManageDoctorsPageListener(frame));
        frame.getContentPane().add(btnBack);

        frame.setVisible(true);
    }
}
