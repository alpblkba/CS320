import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RemoveDoctorListener implements ActionListener {
    JFrame frame;
    public RemoveDoctorListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        RemoveDoctorPage rPage = new RemoveDoctorPage();
    }


}

