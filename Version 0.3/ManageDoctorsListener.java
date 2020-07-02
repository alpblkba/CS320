import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ManageDoctorsListener implements ActionListener {
    JFrame frame;
    public ManageDoctorsListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        ManageDoctorsPage mPage = new ManageDoctorsPage();
    }


}

