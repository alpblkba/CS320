import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DoctorViewAppPageListener implements ActionListener {
    JFrame frame;
    public DoctorViewAppPageListener (JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        DoctorViewAppPage appPage = new DoctorViewAppPage();
    }


}

