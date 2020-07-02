import java.awt.*;

import javax.imageio.ImageIO;
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
        frame.getContentPane().setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Choose an action");
        label.setForeground(Color.white);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 16));
        label.setBounds(160,30,200,70);
        frame.getContentPane().add(label);

        JButton addDoctorButton = new JButton("Add Doctor");
        addDoctorButton.setBounds(65, 100, 150, 50);
        frame.getContentPane().add(addDoctorButton);
        addDoctorButton.addActionListener(new AddDoctorListener(frame));
        JButton removeDoctorButton = new JButton("Remove Doctor");
        removeDoctorButton.setBounds(235, 100, 150, 50);
        removeDoctorButton.addActionListener(new RemoveDoctorListener(frame));
        frame.getContentPane().add(removeDoctorButton);

        JButton back_button2 = new JButton();
        back_button2.setBounds(0,0,80,80);
        try {
            Image img = ImageIO.read(getClass().getResource("bckadmin.png"));
            back_button2.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println(e);
        }
        back_button2.addActionListener(new backToAdminPageListener(frame));
        frame.getContentPane().add(back_button2);

        frame.setVisible(true);
    }
}

