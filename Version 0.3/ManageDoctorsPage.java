import java.awt.*;

import javax.swing.*;

public class ManageDoctorsPage {

    private JFrame frame;

    /**
     * Launch the application.
     */


    /**
     * Create the application.
     */
    public ManageDoctorsPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Choose an action");
        label.setForeground(Color.RED);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 16));
        label.setBounds(175,30,200,70);
        frame.getContentPane().add(label);

        JButton addDoctorButton = new JButton("Add Doctor");
        addDoctorButton.setBounds(65, 100, 150, 50);
        frame.getContentPane().add(addDoctorButton);
        addDoctorButton.addActionListener(new AddDoctorListener(frame));
        JButton removeDoctorButton = new JButton("Remove Doctor");
        removeDoctorButton.setBounds(235, 100, 150, 50);
        removeDoctorButton.addActionListener(new RemoveDoctorListener(frame));
        frame.getContentPane().add(removeDoctorButton);
        frame.setVisible(true);
    }
}

