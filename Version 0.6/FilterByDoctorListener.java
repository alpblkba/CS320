import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FilterByDoctorListener implements ActionListener {
    JFrame frame;
    public FilterByDoctorListener (JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        FilterByDoctorPage filterByDoctorPage = new FilterByDoctorPage();
    }


}

