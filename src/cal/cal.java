package cal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class cal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal frame = new cal();
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
	public cal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 427);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_1.setBounds(69, 39, 358, 39);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setFont(new Font("Elephant", Font.PLAIN, 17));
		lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculator.setBounds(119, 0, 168, 31);
		contentPane.add(lblCalculator);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(62, 32, 372, 96);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.WHITE);
		btnC.setForeground(Color.BLACK);
		btnC.setBounds(141, 139, 49, 31);
		contentPane.add(btnC);
		
		JButton button_15 = new JButton("7");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+7);
			}
		});
		button_15.setBackground(Color.WHITE);
		button_15.setForeground(Color.BLACK);
		button_15.setBounds(141, 181, 49, 31);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("4");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+4);
			}
		});
		button_16.setBackground(Color.WHITE);
		button_16.setForeground(Color.BLACK);
		button_16.setBounds(141, 223, 49, 31);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("1");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+1);
			}
		});
		button_17.setBackground(Color.WHITE);
		button_17.setForeground(Color.BLACK);
		button_17.setBounds(141, 265, 49, 31);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("+/-");
		button_18.setBackground(Color.WHITE);
		button_18.setForeground(Color.BLACK);
		button_18.setBounds(141, 307, 49, 31);
		contentPane.add(button_18);
		
		JButton button_1 = new JButton("( )");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"(");
				
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setForeground(Color.BLACK);
		button_1.setBounds(226, 139, 49, 31);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+8);
			}
		});
		button_2.setBackground(Color.WHITE);
		button_2.setForeground(Color.BLACK);
		button_2.setBounds(226, 181, 49, 31);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+5);
			}
		});
		button_3.setBackground(Color.WHITE);
		button_3.setForeground(Color.BLACK);
		button_3.setBounds(226, 223, 49, 31);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+2);
			}
		});
		button_4.setBackground(Color.WHITE);
		button_4.setForeground(Color.BLACK);
		button_4.setBounds(226, 265, 49, 31);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("0");
		button_5.setBackground(Color.WHITE);
		button_5.setForeground(Color.BLACK);
		button_5.setBounds(226, 307, 49, 31);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("%");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"%");
			}
		});
		button_6.setBackground(Color.WHITE);
		button_6.setForeground(Color.BLACK);
		button_6.setBounds(309, 139, 49, 31);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+9);
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setForeground(Color.BLACK);
		button_7.setBounds(309, 181, 49, 31);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+6);
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setForeground(Color.BLACK);
		button_8.setBounds(309, 223, 49, 31);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+3);
			}
		});
		button_9.setBackground(Color.WHITE);
		button_9.setForeground(Color.BLACK);
		button_9.setBounds(309, 265, 49, 31);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+".");
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setForeground(Color.BLACK);
		button_10.setBounds(309, 307, 49, 31);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"/");
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setForeground(Color.BLACK);
		button_11.setBounds(385, 139, 49, 31);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("X");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"x");
			}
		});
		button_12.setBackground(Color.WHITE);
		button_12.setForeground(Color.BLACK);
		button_12.setBounds(385, 181, 49, 31);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"-");
			}
		});
		button_13.setBackground(Color.WHITE);
		button_13.setForeground(Color.BLACK);
		button_13.setBounds(385, 223, 49, 31);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"+");
			}
		});
		button_14.setBackground(Color.WHITE);
		button_14.setForeground(Color.BLACK);
		button_14.setBounds(385, 265, 49, 31);
		contentPane.add(button_14);
		
		JButton button_19 = new JButton("=");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText()+"=");
			}
		});
		button_19.setBackground(Color.WHITE);
		button_19.setForeground(Color.BLACK);
		button_19.setBounds(385, 307, 49, 31);
		contentPane.add(button_19);
	}
}
