import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;

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
        model.clear();
        QueryHandler handler = new QueryHandler();
        handler.connect();
        ArrayList<String> dList = new ArrayList<>();

        String tString = (String)tbox.getSelectedItem();
        String dString = (String)dbox.getSelectedItem();
        String sql =  "select d_Name from doctor where d_Name not in (select d_Name from make_appointments inner join doctor on doctor.id = make_appointments.d_id where checkin_time = '"+tString+"' and date ='"+dString+"')";
        try {
            ResultSet rs = handler.stmt.executeQuery(sql);
            while(rs.next()){
                dList.add(rs.getString(1));
                model.addElement(rs.getString(1));
            }
        }
        catch (Exception a){
            a.printStackTrace();
        }
    }
}
