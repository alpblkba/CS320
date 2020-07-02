import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class backToPatientPageListener implements ActionListener {
    JFrame frame;
    JTextField email;
    public backToPatientPageListener(JFrame frame, JTextField email) {
        this.frame = frame;
        this.email = email;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        Patientpage patientpage = new Patientpage(email);
    }


}

