import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeSlotListener  implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String petName = (String) cb.getSelectedItem();
        QueryHandler handler = new QueryHandler();
        handler.connect();

    }
}