import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInListener implements ActionListener {
    JFrame frame;
    int role;
    public SignInListener(JFrame frame, int role) {
        this.frame = frame;
        this.role = role;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        LoginPage.role = role;
        LoginPage loginPage = new LoginPage();
        }


    }

