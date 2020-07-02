import java.awt.*;

import javax.swing.*;

public class FilterByDoctorPage {

    private JFrame frame;

    /**
     * Launch the application.
     */


    /**
     * Create the application.
     */
    public FilterByDoctorPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);




        frame.setVisible(true);
    }
}