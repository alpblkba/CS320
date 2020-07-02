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
        MainPage mPage = new MainPage();
    }


}

