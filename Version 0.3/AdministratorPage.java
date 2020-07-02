import java.awt.*;

import javax.swing.*;

public class AdministratorPage {

    private JFrame frame;

    /**
     * Launch the application.
     */


    /**
     * Create the application.
     */
    public AdministratorPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.getContentPane().setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Admin Page");
        label.setForeground(Color.yellow);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 16));
        label.setBounds(175,30,200,70);
        frame.getContentPane().add(label);

        JButton btnViewAppointments = new JButton("View Appointments");
        btnViewAppointments.setBounds(65, 100, 150, 50);
        frame.getContentPane().add(btnViewAppointments);

        JButton btnManageDoctors = new JButton("Manage Doctors");
        btnManageDoctors.setBounds(235, 100, 150, 50);
        btnManageDoctors.addActionListener(new ManageDoctorsListener(frame));
        frame.getContentPane().add(btnManageDoctors);
        frame.setVisible(true);
    }
}

