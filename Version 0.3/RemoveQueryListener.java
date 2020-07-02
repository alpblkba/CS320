import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RemoveQueryListener implements ActionListener {
    JFrame frame;
    public RemoveQueryListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        JOptionPane.showMessageDialog(null,"BRUH");
        AdministratorPage aPage = new AdministratorPage();
    }


}

