import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalInfoListener implements ActionListener {
    JFrame frame;
    JTextField email;
    public PersonalInfoListener(JFrame frame, JTextField email) {
        this.frame = frame;
        this.email = email;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        PersonalInfoPage infoPage = new PersonalInfoPage(email);
        System.out.println("Button clicked!");
    }
}
