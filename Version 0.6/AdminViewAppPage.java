import java.awt.*;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.*;

public class AdminViewAppPage {

    private JFrame frame;

    /**
     * Launch the application.
     */


    /**
     * Create the application.
     */
    public AdminViewAppPage() {
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

        JLabel label = new JLabel("Appointments");
        label.setForeground(Color.black);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 16));
        label.setBounds(150,3,200,20);
        frame.getContentPane().add(label);

        JButton back_button = new JButton();
        back_button.setBounds(0,0,80,80);
        try {
            Image img = ImageIO.read(getClass().getResource("bckadmin.png"));
            back_button.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println(e);
        }
        back_button.addActionListener(new backToAdminPageListener(frame));
        frame.getContentPane().add(back_button);



        DefaultListModel model = new DefaultListModel();
        JList appList = new JList(model);
        appList.setLayoutOrientation(JList.VERTICAL);
        appList.setBounds(100,30,220,200);
        frame.add(appList);

        ViewAppointments vA = new ViewAppointments();

        ResultSet rs = vA.view();


        try{
            while(rs.next()){
                String elegance ="AppID = "+ rs.getString(1) + " PatientID = " + rs.getString(2) + " DoctorID = " + rs.getString(3);
                model.addElement(elegance);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}