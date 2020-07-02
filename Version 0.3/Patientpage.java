import java.awt.*;

import javax.swing.*;

public class Patientpage {

    private JFrame frame;

    /**
     * Launch the application.
     */
    /**
     * Create the application.
     */
    public Patientpage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);
        frame.getContentPane().setLayout(null);


        JLabel label = new JLabel("Patient Homepage ");
        label.setForeground(Color.blue);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 15));
        label.setBounds(150,1,200,70);
        frame.getContentPane().add(label);


        JButton btnManagePersonalInfo = new JButton("Manage Personal Info");
        btnManagePersonalInfo.setBounds(120, 60, 173, 23);
        frame.getContentPane().add(btnManagePersonalInfo);

        JButton btnMakeAnAppointment = new JButton("Make an Appointment");
        btnMakeAnAppointment.setBounds(120, 120, 173, 23);
        frame.getContentPane().add(btnMakeAnAppointment);

        JButton btnViewAppoinments = new JButton("View Appoinments");
        btnViewAppoinments.setBounds(120, 180, 173, 23);
        frame.getContentPane().add(btnViewAppoinments);
        frame.setVisible(true);
    }
}
