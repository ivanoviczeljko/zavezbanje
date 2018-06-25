package radio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import classes.radioLogic;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	radioLogic radio=new radioLogic();
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(246, 31, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(246, 85, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("u");
		JButton btnNewButton_1 = new JButton("i");
		JButton btnf = new JButton("+f");
		JButton btnf_1 = new JButton("-f");
		JButton btnz = new JButton("+z");
		JButton btnz_1 = new JButton("-z");

		radio.stateOFF();
		textField.setText(String.valueOf(radio.getF()));
		textField_1.setText(String.valueOf(radio.getZ()));
		
		btnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.addf();
				textField.setText(String.valueOf(radio.getF()));
			}
		});
		btnf_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.minusf();
				textField.setText(String.valueOf(radio.getF()));
			}
		});
		btnz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.addz();
				textField_1.setText(String.valueOf(radio.getZ()));
			}
		});
		btnz_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.minusz();
				textField_1.setText(String.valueOf(radio.getZ()));
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.stateOFF();
				btnNewButton_1.setEnabled(false);
				btnf.setEnabled(false);
				btnf_1.setEnabled(false);
				btnz.setEnabled(false);
				btnz_1.setEnabled(false);
				btnNewButton.setEnabled(true);
				textField.setText(String.valueOf(radio.getF()));
				textField_1.setText(String.valueOf(radio.getZ()));
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radio.stateOn();
				btnNewButton_1.setEnabled(true);
				btnf.setEnabled(true);
				btnf_1.setEnabled(true);
				btnz.setEnabled(true);
				btnz_1.setEnabled(true);
				btnNewButton.setEnabled(false);
				textField.setText(String.valueOf(radio.getF()));
				textField_1.setText(String.valueOf(radio.getZ()));
			}
		});
		btnNewButton.setBounds(33, 30, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(33, 66, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	
		btnf.setEnabled(false);
		btnf.setBounds(33, 97, 89, 23);
		frame.getContentPane().add(btnf);
		
		
		btnf_1.setEnabled(false);
		btnf_1.setBounds(33, 133, 89, 23);
		frame.getContentPane().add(btnf_1);
		
		
		btnz.setEnabled(false);
		btnz.setBounds(33, 166, 89, 23);
		frame.getContentPane().add(btnz);
		
		
		btnz_1.setEnabled(false);
		btnz_1.setBounds(33, 202, 89, 23);
		frame.getContentPane().add(btnz_1);
	}
}
