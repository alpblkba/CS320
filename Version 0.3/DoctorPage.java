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
		frame.getContentPane().setBackground(Color.ORANGE);

		JLabel label = new JLabel("Doctor Page");
		label.setForeground(Color.blue);
		label.setBounds(50,25,150,75);
		label.setFont(new Font("Sans-Serif", Font.BOLD, 15));
		frame.getContentPane().add(label);
		
		JButton btnViewApoointments = new JButton("View Appointments");
		btnViewApoointments.setBounds(50, 111, 169, 23);
		frame.getContentPane().add(btnViewApoointments);
		frame.setVisible(true);

		JButton btnCancelApoointments = new JButton("Cancel Appointments");
		btnCancelApoointments.setBounds(230, 111, 169, 23);
		frame.getContentPane().add(btnCancelApoointments);
		frame.setVisible(true);
	}
}
