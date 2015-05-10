package Todo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(46, 227, 276, 24);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 203, 246, 24);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(81, 179, 209, 24);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(97, 156, 179, 24);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(112, 132, 153, 24);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(125, 109, 128, 24);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(142, 86, 96, 24);
		contentPane.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(157, 62, 68, 24);
		contentPane.add(panel_7);
		
		JButton button = new JButton("1");
		button.setBounds(26, 11, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(26, 46, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(318, 11, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(318, 46, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(612, 11, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(612, 46, 89, 23);
		contentPane.add(button_5);
		
		JLabel lblHola = new JLabel("Hola");
		lblHola.setBounds(81, 294, 241, 33);
		contentPane.add(lblHola);
	}
}
