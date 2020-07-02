import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class AddDoctorPage {
    public static int role;
    private JFrame frame;
    private JTextField email;
    private JTextField name;
    private JTextField department;
    private JPasswordField password;

    /**
     * Launch the application.
     */
    /**
     * Create the application.
     */
    public AddDoctorPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame("Add Doctor Page");
        frame.setBounds(100, 100, 650, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Add a Doctor");
        label.setForeground(Color.blue);
        label.setBounds(82,15,150,75);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 15));
        frame.getContentPane().add(label);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(82, 79, 68, 27);
        frame.getContentPane().add(lblEmail);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(82, 134, 68, 27);
        frame.getContentPane().add(lblPassword);

        JLabel lblName= new JLabel("Name");
        lblName.setBounds(82, 189, 68, 27);
        frame.getContentPane().add(lblName);

        JLabel departmentName= new JLabel("Department");
        departmentName.setBounds(82, 244, 68, 27);
        frame.getContentPane().add(departmentName);

        email = new JTextField();
        email.setBounds(199, 82, 96, 20);
        frame.getContentPane().add(email);
        email.setColumns(10);

        password = new JPasswordField();
        password.setEchoChar('*');
        password.setBounds(199, 137, 96, 20);
        frame.getContentPane().add(password);
        password.setColumns(10);

        name = new JTextField();
        name.setBounds(199, 192, 96, 20);
        frame.getContentPane().add(name);
        name.setColumns(10);

        department = new JTextField();
        department.setBounds(199, 247, 96, 20);
        frame.getContentPane().add(department);
        department.setColumns(10);

        JButton addDoctor = new JButton("Add");
        addDoctor.addActionListener(new AddQueryListener(frame,email,password,name,department));
        addDoctor.setBounds(199, 302, 87, 23);
        frame.getContentPane().add(addDoctor);

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
