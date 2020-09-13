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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class cal extends JFrame {

	private JPanel contentPane;
	private JTextField txtdisplay;

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
		setTitle("Scientific Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 333);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.WHITE);
		btnC.setForeground(Color.BLACK);
		btnC.setBounds(28, 86, 49, 31);
		contentPane.add(btnC);
		
		JButton button_15 = new JButton("7");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+7);
			}
		});
		button_15.setBackground(Color.WHITE);
		button_15.setForeground(Color.BLACK);
		button_15.setBounds(28, 128, 49, 31);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("4");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+4);
			}
		});
		button_16.setBackground(Color.WHITE);
		button_16.setForeground(Color.BLACK);
		button_16.setBounds(28, 170, 49, 31);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("1");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+1);
			}
		});
		button_17.setBackground(Color.WHITE);
		button_17.setForeground(Color.BLACK);
		button_17.setBounds(28, 212, 49, 31);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("+/-");
		button_18.setBackground(Color.WHITE);
		button_18.setForeground(Color.BLACK);
		button_18.setBounds(28, 254, 49, 31);
		contentPane.add(button_18);
		
		JButton button_1 = new JButton("( )");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+"(");
				
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setForeground(Color.BLACK);
		button_1.setBounds(87, 86, 49, 31);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+8);
			}
		});
		button_2.setBackground(Color.WHITE);
		button_2.setForeground(Color.BLACK);
		button_2.setBounds(87, 128, 49, 31);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+5);
			}
		});
		button_3.setBackground(Color.WHITE);
		button_3.setForeground(Color.BLACK);
		button_3.setBounds(87, 170, 49, 31);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+2);
			}
		});
		button_4.setBackground(Color.WHITE);
		button_4.setForeground(Color.BLACK);
		button_4.setBounds(87, 212, 49, 31);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("0");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtdisplay.setText(txtdisplay.getText()+0);
			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setForeground(Color.BLACK);
		button_5.setBounds(87, 254, 49, 31);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("%");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+"%");
			}
		});
		button_6.setBackground(Color.WHITE);
		button_6.setForeground(Color.BLACK);
		button_6.setBounds(146, 86, 49, 31);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+9);
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setForeground(Color.BLACK);
		button_7.setBounds(146, 128, 49, 31);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+6);
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setForeground(Color.BLACK);
		button_8.setBounds(146, 170, 49, 31);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+3);
			}
		});
		button_9.setBackground(Color.WHITE);
		button_9.setForeground(Color.BLACK);
		button_9.setBounds(146, 212, 49, 31);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+".");
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setForeground(Color.BLACK);
		button_10.setBounds(146, 254, 49, 31);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+"/");
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setForeground(Color.BLACK);
		button_11.setBounds(205, 86, 49, 31);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("X");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+"x");
			}
		});
		button_12.setBackground(Color.WHITE);
		button_12.setForeground(Color.BLACK);
		button_12.setBounds(205, 128, 49, 31);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+"-");
			}
		});
		button_13.setBackground(Color.WHITE);
		button_13.setForeground(Color.BLACK);
		button_13.setBounds(205, 170, 49, 31);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+"+");
			}
		});
		button_14.setBackground(Color.WHITE);
		button_14.setForeground(Color.BLACK);
		button_14.setBounds(205, 212, 49, 31);
		contentPane.add(button_14);
		
		JButton button_19 = new JButton("=");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+"=");
			}
		});
		button_19.setBackground(Color.WHITE);
		button_19.setForeground(Color.BLACK);
		button_19.setBounds(205, 254, 49, 31);
		contentPane.add(button_19);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setBounds(0, 0, 27, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmStanderd = new JMenuItem("Standard");
		mntmStanderd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setTitle("Standard Calculator");
				setBounds(100, 100, 272, 374);
				txtdisplay.setBounds(32, 11, 204, 54);
			}
		});
		mnNewMenu.add(mntmStanderd);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Scientific");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setTitle("Scientific Calculator");
				setBounds(100, 100, 540, 374);
				txtdisplay.setBounds(32, 11, 480, 54);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Unit Converter");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setTitle("Unit Converter");
				setBounds(100, 100, 750, 374);
				txtdisplay.setBounds(32, 11, 494, 54);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		txtdisplay = new JTextField();
		txtdisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdisplay.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtdisplay.setBounds(32, 11, 222, 54);
		contentPane.add(txtdisplay);
		txtdisplay.setColumns(10);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSin.setForeground(Color.BLACK);
		btnSin.setBackground(Color.WHITE);
		btnSin.setBounds(281, 86, 69, 31);
		contentPane.add(btnSin);
		
		JButton btnSin_1 = new JButton("Sin-1");
		btnSin_1.setForeground(Color.BLACK);
		btnSin_1.setBackground(Color.WHITE);
		btnSin_1.setBounds(281, 128, 69, 31);
		contentPane.add(btnSin_1);
		
		JButton btnXy = new JButton("x^y");
		btnXy.setForeground(Color.BLACK);
		btnXy.setBackground(Color.WHITE);
		btnXy.setBounds(281, 170, 69, 31);
		contentPane.add(btnXy);
		
		JButton button_22 = new JButton("\u03C0");
		button_22.setForeground(Color.BLACK);
		button_22.setBackground(Color.WHITE);
		button_22.setBounds(281, 212, 69, 31);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("=");
		button_23.setForeground(Color.BLACK);
		button_23.setBackground(Color.WHITE);
		button_23.setBounds(281, 254, 69, 31);
		contentPane.add(button_23);
		
		JButton btnCos = new JButton("cos");
		btnCos.setForeground(Color.BLACK);
		btnCos.setBackground(Color.WHITE);
		btnCos.setBounds(348, 86, 69, 31);
		contentPane.add(btnCos);
		
		JButton btnCos_1 = new JButton("cos-1");
		btnCos_1.setForeground(Color.BLACK);
		btnCos_1.setBackground(Color.WHITE);
		btnCos_1.setBounds(348, 128, 69, 31);
		contentPane.add(btnCos_1);
		
		JButton btnX = new JButton("x^2");
		btnX.setForeground(Color.BLACK);
		btnX.setBackground(Color.WHITE);
		btnX.setBounds(348, 170, 69, 31);
		contentPane.add(btnX);
		
		JButton button_27 = new JButton("+");
		button_27.setForeground(Color.BLACK);
		button_27.setBackground(Color.WHITE);
		button_27.setBounds(348, 212, 69, 31);
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("=");
		button_28.setForeground(Color.BLACK);
		button_28.setBackground(Color.WHITE);
		button_28.setBounds(348, 254, 69, 31);
		contentPane.add(button_28);
		
		JButton btnTan = new JButton("tan");
		btnTan.setForeground(Color.BLACK);
		btnTan.setBackground(Color.WHITE);
		btnTan.setBounds(415, 86, 69, 31);
		contentPane.add(btnTan);
		
		JButton btnTan_1 = new JButton("tan-1");
		btnTan_1.setForeground(Color.BLACK);
		btnTan_1.setBackground(Color.WHITE);
		btnTan_1.setBounds(415, 128, 69, 31);
		contentPane.add(btnTan_1);
		
		JButton button_31 = new JButton("-");
		button_31.setForeground(Color.BLACK);
		button_31.setBackground(Color.WHITE);
		button_31.setBounds(415, 170, 69, 31);
		contentPane.add(button_31);
		
		JButton button_32 = new JButton("+");
		button_32.setForeground(Color.BLACK);
		button_32.setBackground(Color.WHITE);
		button_32.setBounds(415, 212, 69, 31);
		contentPane.add(button_32);
		
		JButton button_33 = new JButton("=");
		button_33.setForeground(Color.BLACK);
		button_33.setBackground(Color.WHITE);
		button_33.setBounds(415, 254, 69, 31);
		contentPane.add(button_33);
		
		JButton btnLog = new JButton("log");
		btnLog.setForeground(Color.BLACK);
		btnLog.setBackground(Color.WHITE);
		btnLog.setBounds(482, 86, 69, 31);
		contentPane.add(btnLog);
		
		JButton btnLnx = new JButton("ln");
		btnLnx.setForeground(Color.BLACK);
		btnLnx.setBackground(Color.WHITE);
		btnLnx.setBounds(482, 128, 69, 31);
		contentPane.add(btnLnx);
		
		JButton button_36 = new JButton("-");
		button_36.setForeground(Color.BLACK);
		button_36.setBackground(Color.WHITE);
		button_36.setBounds(482, 170, 69, 31);
		contentPane.add(button_36);
		
		JButton button_37 = new JButton("+");
		button_37.setForeground(Color.BLACK);
		button_37.setBackground(Color.WHITE);
		button_37.setBounds(482, 212, 69, 31);
		contentPane.add(button_37);
		
		JButton button_38 = new JButton("=");
		button_38.setForeground(Color.BLACK);
		button_38.setBackground(Color.WHITE);
		button_38.setBounds(482, 254, 69, 31);
		contentPane.add(button_38);
	}
}
