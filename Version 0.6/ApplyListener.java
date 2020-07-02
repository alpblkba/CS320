import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplyListener implements ActionListener {
    JComboBox tbox;
    JComboBox dbox;
    JList dlist;
    DefaultListModel model;
    public ApplyListener(JComboBox tbox, JComboBox dbox, JList dlist, DefaultListModel model){
        this.tbox = tbox;
        this.dbox = dbox;
        this.dlist = dlist;
        this.model = model;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String tString = (String)tbox.getSelectedItem();
        String dString = (String)dbox.getSelectedItem();
        model.addElement("AHMET");
        String dLString = (String)dlist.getSelectedValue();
        JOptionPane.showMessageDialog(null,"BRUH"+tString+"BRUH"+dString);
    }
}
