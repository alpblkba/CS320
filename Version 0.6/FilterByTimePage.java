import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class FilterByTimePage {

    private JFrame frame;
    public String[] timeslots = {"10:00-11:00","11:00-12:00","12:00-13:00","13:00-14:00","14:00-15:00","15:00-16:00","16:00-17:00"};

    public static String getStr(int yy, int mm, int dd) {
        String str = Integer.toString(dd) + "/" + Integer.toString(mm) + "/" + Integer.toString(yy);
        return str;
    }

    /**
     * Launch the application.
     */


    /**
     * Create the application.
     */
    public FilterByTimePage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        JLabel label = new JLabel("Select a time-slot");
        label.setForeground(Color.black);
        label.setFont(new Font("Sans-Serif", Font.BOLD, 18));
        label.setBounds(30,20,200,70);
        frame.getContentPane().add(label);

        ArrayList<String> days = new ArrayList<String>();
        String day;


        for (int yy = 2020; yy <= 2023; yy++) {
            for (int mm = 1; mm <= 12; mm++) {
                for (int dd = 1; dd <= 31; dd++) {
                    if (mm == 2 && dd == 29)
                        break;
                    if ((mm == 1||mm == 3|| mm == 5|| mm == 7|| mm == 8||mm == 10||mm == 12) && dd == 32)
                    break;
                    if ((mm == 4||mm == 6||mm == 9 || mm == 11) && dd == 31)
                    break;

                    days.add(getStr(yy, mm, dd));
                }
            }
        }
        //System.out.println(days);
        String[] dateslots = days.toArray(new String[days.size()]);

        JComboBox time_slots = new JComboBox(timeslots);
        time_slots.setBounds(30, 70, 100, 23);
        time_slots.setSelectedItem(null);
        frame.getContentPane().add(time_slots);


        JLabel dlabel = new JLabel("Select a date");
        dlabel.setForeground(Color.black);
        dlabel.setFont(new Font("Sans-Serif", Font.BOLD, 18));
        dlabel.setBounds(30,80,200,70);
        frame.getContentPane().add(dlabel);

        JButton apply = new JButton("Apply");
        apply.setForeground(Color.black);
        apply.setBackground(Color.white);
        apply.setBounds(30,190,100,50);

        frame.add(apply);
        DefaultListModel model = new DefaultListModel();
        JList doctorList = new JList(model);
        doctorList.setLayoutOrientation(JList.VERTICAL);
        doctorList.setBounds(200,40,200,200);
        frame.add(doctorList);

        JComboBox date_slots = new JComboBox(dateslots);
        date_slots.setBounds(30, 130, 100, 23);
        date_slots.setSelectedItem(null);
        frame.getContentPane().add(date_slots);
        apply.addActionListener(new ApplyListener(time_slots,date_slots,doctorList,model));
        frame.getRootPane().setDefaultButton(apply);
        frame.setVisible(true);
    }
}