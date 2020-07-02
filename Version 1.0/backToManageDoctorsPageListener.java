import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class backToManageDoctorsPageListener implements ActionListener {
    JFrame frame;
    public backToManageDoctorsPageListener(JFrame frame) {

        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        ManageDoctorsPage manageDoctorsPage  = new ManageDoctorsPage();
    }


}

