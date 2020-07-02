import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminCancelAppButtonListener implements ActionListener {
    private JFrame frame;
    private JList list;
    private DefaultListModel model;

    public AdminCancelAppButtonListener(JFrame frame, JList list, DefaultListModel model) {
        this.frame = frame;
        this.list = list;
        this.model = model;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String cancel = list.getSelectedValue().toString();
        cancel = cancel.substring(8,10).trim();
        QueryHandler handler = new QueryHandler();
        handler.connect();
        try {
            Statement stmt = handler.conn.createStatement();
            stmt.executeUpdate("delete from make_appointments where id = "+Integer.parseInt(cancel));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(cancel);

    }
}
