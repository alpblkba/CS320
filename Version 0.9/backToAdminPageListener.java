import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class backToAdminPageListener implements ActionListener {
    JFrame frame;
    public backToAdminPageListener(JFrame frame) {

        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        AdministratorPage administratorPage = new AdministratorPage();
    }


}

