import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MakeAppointmentPageListener implements ActionListener {
    JFrame frame;
    public MakeAppointmentPageListener (JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        MakeAppointmentPage makeAppointmentPage = new MakeAppointmentPage();
    }


}

