import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class DoctorPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public DoctorPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.blue);

		JLabel label = new JLabel("Doctor Page");
		label.setForeground(Color.blue);
		label.setBounds(50,25,150,75);
		label.setFont(new Font("Sans-Serif", Font.BOLD, 15));
		frame.getContentPane().add(label);
		
		JButton btnViewAppointments = new JButton("View Appointments");
		btnViewAppointments.setBounds(50, 111, 169, 23);
		frame.getContentPane().add(btnViewAppointments);

		JButton btnCancelAppointments = new JButton("Cancel Appointments");
		btnCancelAppointments.setBounds(230, 111, 169, 23);
		frame.getContentPane().add(btnCancelAppointments);
		JButton backbutton = new JButton();
		backbutton.setBounds(0,0,73,73);
		try {
			Image img = ImageIO.read(getClass().getResource("backmainb.png"));
			backbutton.setIcon(new ImageIcon(img));
		} catch (Exception e) {
			System.out.println(e);
		}
		backbutton.addActionListener(new backToMainListener(frame));
		frame.getContentPane().add(backbutton);

		frame.setVisible(true);
	}
}
