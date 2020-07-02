import java.awt.*;
import javax.swing.*;


public class MainPage  {

    private JFrame frame;

    public MainPage(){
        display();
    }

    private void display() {

        frame = new JFrame("Hospital Management System");
        frame.setIconImage(new ImageIcon(getClass().getResource("favicon.jpg")).getImage());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,5));
        frame.add(new JLabel("                                             HOSPITAL MANAGEMENT SYSTEM"));
        JButton signin = new JButton("Sign in as Patient");
        signin.setForeground(Color.white);
        signin.setBackground(Color.PINK);
        signin.addActionListener(new SignInListener(frame,1));
        JButton signinD = new JButton("Sign in as Doctor");
        signinD.setBackground(Color.PINK);
        signinD.setForeground(Color.white);
        signinD.addActionListener(new SignInListener(frame,2));
        JButton signinA = new JButton("Sign in as Admin");
        signinA.setBackground(Color.PINK);
        signinA.setForeground(Color.white);
        signinA.addActionListener(new SignInListener(frame,3));
        JButton signup = new JButton("Sign up");
        signup.setBackground(Color.PINK);
        signup.setForeground(Color.white);
        signup.addActionListener(new RegisterListener(frame));
        frame.add(signin);
        frame.add(signinD);
        frame.add(signinA);
        frame.add(signup);

        frame.setVisible(true);


    }


}
