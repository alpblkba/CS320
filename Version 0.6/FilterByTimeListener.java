import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FilterByTimeListener implements ActionListener {
    JFrame frame;
    public FilterByTimeListener (JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        FilterByTimePage filterByTimePage = new FilterByTimePage();

    }


}

