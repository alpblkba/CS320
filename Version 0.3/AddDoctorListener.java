import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddDoctorListener implements ActionListener {
    JFrame frame;
    public AddDoctorListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        AddDoctorPage dPage = new AddDoctorPage();
    }


}

