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

public class cal extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

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
		setBounds(100, 100, 450, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setForeground(new Color(0, 0, 0));
		t1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		t1.setBounds(139, 68, 70, 39);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try{
					int num1,num2,ans;
					num1=Integer.parseInt(t1.getText());
					num2=Integer.parseInt(t2.getText());
					ans=num1+num2;
					t3.setText(Integer.toString(ans));
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null,"Enter Valid Number");
					
				}
				
				
			}
		});
		btnNewButton.setBounds(10, 130, 89, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					int num1,num2,ans;
					num1=Integer.parseInt(t1.getText());
					num2=Integer.parseInt(t2.getText());
					ans=num1-num2;
					t3.setText(Integer.toString(ans));
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null,"Enter Valid Number");
					
				}
			}
		});
		btnNewButton_1.setBounds(120, 130, 89, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					int num1,num2,ans;
					num1=Integer.parseInt(t1.getText());
					num2=Integer.parseInt(t2.getText());
					ans=num1*num2;
					t3.setText(Integer.toString(ans));
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null,"Enter Valid Number");
					
				}
			}
		});
		btnNewButton_2.setBounds(225, 130, 89, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					int num1,num2,ans;
					num1=Integer.parseInt(t1.getText());
					num2=Integer.parseInt(t2.getText());
					ans=num1/num2;
					t3.setText(Integer.toString(ans));
					
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null,"Enter Valid Number");
					
				}
			}
		});
		btnNewButton_3.setBounds(335, 130, 89, 50);
		contentPane.add(btnNewButton_3);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		t2.setBounds(225, 68, 70, 39);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setBounds(228, 213, 86, 39);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Your Answer is");
		lblAnswer.setFont(new Font("Arno Pro Caption", Font.PLAIN, 16));
		lblAnswer.setBounds(91, 220, 118, 27);
		contentPane.add(lblAnswer);
		
		JLabel lblSimpleCalculator = new JLabel("SIMPLE CALCULATOR");
		lblSimpleCalculator.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSimpleCalculator.setBounds(120, 0, 266, 46);
		contentPane.add(lblSimpleCalculator);
	}
}
