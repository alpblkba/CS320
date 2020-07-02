import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdminViewAppPageListener implements ActionListener {
    JFrame frame;
    public AdminViewAppPageListener (JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        AdminViewAppPage appPage = new AdminViewAppPage();
    }


}

