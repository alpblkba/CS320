import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {
    JFrame frame;
    public LoginListener(JFrame frame) {
        this.frame = frame;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        System.out.println(LoginPage.role);
        switch (LoginPage.role){
            case 1:
                if(true){
                    Patientpage pPage = new Patientpage();
                }
                break;
            case 2:
                DoctorPage dPage = new DoctorPage();
                break;
            case 3:
                AdministratorPage aPage = new AdministratorPage();
                break;
        }
    }
}
