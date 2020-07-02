import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DoctorListApplyListener implements ActionListener {
    JComboBox dbox;
    JList tlist;
    DefaultListModel model;
    public DoctorListApplyListener(JComboBox dbox, JList tlist, DefaultListModel model){

        this.dbox = dbox;
        this.tlist = tlist;
        this.model = model;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        model.clear();
        QueryHandler handler = new QueryHandler();
        handler.connect();
        ArrayList<String> tList = new ArrayList<>();


        String dString = (String)dbox.getSelectedItem();
        //String sql =  "select d_Name from doctor where d_Name not in (select d_Name from make_appointments inner join " +
               // "doctor on doctor.id = make_appointments.d_id where checkin_time = '"+tString+"' and date ='"+dString+"')";
        /*try {
            ResultSet rs = handler.stmt.executeQuery(sql);
            while(rs.next()){
                tList.add(rs.getString(1));
                model.addElement(rs.getString(1));
            }
        }
        catch (Exception a){
            a.printStackTrace();
        }
        */

    }
}
