import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class backToDoctorPageListener implements ActionListener {
    JFrame frame;
    public backToDoctorPageListener(JFrame frame) {

        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        DoctorPage administratorPage = new DoctorPage();
    }


}

