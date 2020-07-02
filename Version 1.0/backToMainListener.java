import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class backToMainListener implements ActionListener {
    JFrame frame;
    public backToMainListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        JOptionPane.showMessageDialog(null,"You are logged-out");
        MainPage mPage = new MainPage();
    }


}

