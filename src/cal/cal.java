package cal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JComboBox;

public class cal extends JFrame {

	private JPanel contentPane;
	private JTextField txtdisplay;
	private JTextField JtxtConverter;
	private JTextField JlblConverter;
	double fnum;
	double snum;
	double result;
	
	String ope;
	String ans;
	double kilo=1000;
	
	

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
		setBounds(100, 100, 301, 360);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtdisplay.setText(" ");
			}
		});
		btnC.setBackground(Color.WHITE);
		btnC.setForeground(Color.RED);
		btnC.setBounds(28, 86, 49, 31);
		contentPane.add(btnC);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=txtdisplay.getText()+btn7.getText();
				txtdisplay.setText(num);
			}
		});
		btn7.setBackground(Color.WHITE);
		btn7.setForeground(Color.BLACK);
		btn7.setBounds(28, 128, 49, 31);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=txtdisplay.getText()+btn4.getText();
				txtdisplay.setText(num);
			}
		});
		btn4.setBackground(Color.WHITE);
		btn4.setForeground(Color.BLACK);
		btn4.setBounds(28, 170, 49, 31);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=txtdisplay.getText()+btn1.getText();
				txtdisplay.setText(num);
			}
		});
		btn1.setBackground(Color.WHITE);
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(28, 212, 49, 31);
		contentPane.add(btn1);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtdisplay.setText(" ");
			}
		});
		btnCe.setBackground(Color.WHITE);
		btnCe.setForeground(Color.BLACK);
		btnCe.setBounds(76, 86, 49, 31);
		contentPane.add(btnCe);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=txtdisplay.getText()+btn8.getText();
				txtdisplay.setText(num);
			}
		});
		btn8.setBackground(Color.WHITE);
		btn8.setForeground(Color.BLACK);
		btn8.setBounds(76, 128, 49, 31);
		contentPane.add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=txtdisplay.getText()+btn5.getText();
				txtdisplay.setText(num);
			}
		});
		btn5.setBackground(Color.WHITE);
		btn5.setForeground(Color.BLACK);
		btn5.setBounds(76, 170, 49, 31);
		contentPane.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=txtdisplay.getText()+btn2.getText();
				txtdisplay.setText(num);
			}
		});
		btn2.setBackground(Color.WHITE);
		btn2.setForeground(Color.BLACK);
		btn2.setBounds(76, 212, 49, 31);
		contentPane.add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=txtdisplay.getText()+btn0.getText();
				txtdisplay.setText(num);
			}
		});
		btn0.setBackground(Color.WHITE);
		btn0.setForeground(Color.BLACK);
		btn0.setBounds(28, 254, 97, 31);
		contentPane.add(btn0);
		
		JButton button_6 = new JButton("%");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText(" ");
				ope="%";
			}
		});
		button_6.setBackground(Color.WHITE);
		button_6.setForeground(Color.BLACK);
		button_6.setBounds(124, 86, 49, 31);
		contentPane.add(button_6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=txtdisplay.getText()+btn9.getText();
				txtdisplay.setText(num);
			}
		});
		btn9.setBackground(Color.WHITE);
		btn9.setForeground(Color.BLACK);
		btn9.setBounds(124, 128, 49, 31);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=txtdisplay.getText()+btn6.getText();
				txtdisplay.setText(num);
			}
		});
		btn6.setBackground(Color.WHITE);
		btn6.setForeground(Color.BLACK);
		btn6.setBounds(124, 170, 49, 31);
		contentPane.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=txtdisplay.getText()+btn3.getText();
				txtdisplay.setText(num);
			}
		});
		btn3.setBackground(Color.WHITE);
		btn3.setForeground(Color.BLACK);
		btn3.setBounds(124, 212, 49, 31);
		contentPane.add(btn3);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtdisplay.setText(txtdisplay.getText()+".");
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setForeground(Color.BLACK);
		button_10.setBounds(124, 254, 49, 31);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("\u00B1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=ops*(-1);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setForeground(Color.BLACK);
		button_11.setBounds(172, 86, 49, 31);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText(" ");
				ope="*";
			}
		});
		button_12.setBackground(Color.WHITE);
		button_12.setForeground(Color.BLACK);
		button_12.setBounds(172, 128, 49, 31);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText(" ");
				ope="-";
				
			}
		});
		button_13.setBackground(Color.WHITE);
		button_13.setForeground(Color.BLACK);
		button_13.setBounds(172, 170, 49, 31);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText(" ");
				ope="+";
				
				
			}
		});
		button_14.setBackground(Color.WHITE);
		button_14.setForeground(Color.BLACK);
		button_14.setBounds(172, 212, 49, 31);
		contentPane.add(button_14);
		
		JButton button_19 = new JButton("/");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText(" ");
				ope="/";
			}
		});
		button_19.setBackground(Color.WHITE);
		button_19.setForeground(Color.BLACK);
		button_19.setBounds(172, 254, 49, 31);
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
				setBounds(100, 100, 308, 374);
				txtdisplay.setBounds(32, 11, 209, 54);
			}
		});
		mnNewMenu.add(mntmStanderd);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Scientific");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setTitle("Scientific Calculator");
				setBounds(100, 100, 740, 374);
				txtdisplay.setBounds(32, 11, 450, 54);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
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
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.sin(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setForeground(Color.BLACK);
		btnSin.setBackground(Color.WHITE);
		btnSin.setBounds(293, 86, 69, 31);
		contentPane.add(btnSin);
		
		JButton btnSin_1 = new JButton("Sin-1");
		btnSin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.asin(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnSin_1.setForeground(Color.BLACK);
		btnSin_1.setBackground(Color.WHITE);
		btnSin_1.setBounds(293, 128, 69, 31);
		contentPane.add(btnSin_1);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops1=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				double ops2=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				double ops3;
				ops3=Math.pow(ops1, ops2);
				txtdisplay.setText(String.valueOf(ops3));
			}
		});
		btnXy.setForeground(Color.BLACK);
		btnXy.setBackground(Color.WHITE);
		btnXy.setBounds(293, 170, 69, 31);
		contentPane.add(btnXy);
		
		JButton btnx_1 = new JButton("Rud");
		btnx_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.round(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnx_1.setForeground(Color.BLACK);
		btnx_1.setBackground(Color.WHITE);
		btnx_1.setBounds(293, 212, 69, 31);
		contentPane.add(btnx_1);
		
		JButton btnHypot = new JButton("2*\u03C0");
		btnHypot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops;
				ops=2*(3.141592653589793238);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnHypot.setForeground(Color.BLACK);
		btnHypot.setBackground(Color.WHITE);
		btnHypot.setBounds(293, 254, 69, 31);
		contentPane.add(btnHypot);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.cos(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnCos.setForeground(Color.BLACK);
		btnCos.setBackground(Color.WHITE);
		btnCos.setBounds(360, 86, 69, 31);
		contentPane.add(btnCos);
		
		JButton btnCos_1 = new JButton("cos-1");
		btnCos_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.acos(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnCos_1.setForeground(Color.BLACK);
		btnCos_1.setBackground(Color.WHITE);
		btnCos_1.setBounds(360, 128, 69, 31);
		contentPane.add(btnCos_1);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=(ops*ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnX.setForeground(Color.BLACK);
		btnX.setBackground(Color.WHITE);
		btnX.setBounds(360, 170, 69, 31);
		contentPane.add(btnX);
		
		JButton btnx = new JButton("|x|");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.abs(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnx.setForeground(Color.BLACK);
		btnx.setBackground(Color.WHITE);
		btnx.setBounds(360, 212, 69, 31);
		contentPane.add(btnx);
		
		JButton btnLog_3 = new JButton("log");
		btnLog_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.log(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnLog_3.setForeground(Color.BLACK);
		btnLog_3.setBackground(Color.WHITE);
		btnLog_3.setBounds(360, 254, 69, 31);
		contentPane.add(btnLog_3);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.tan(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnTan.setForeground(Color.BLACK);
		btnTan.setBackground(Color.WHITE);
		btnTan.setBounds(427, 86, 69, 31);
		contentPane.add(btnTan);
		
		JButton btnTan_1 = new JButton("tan-1");
		btnTan_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.atan(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnTan_1.setForeground(Color.BLACK);
		btnTan_1.setBackground(Color.WHITE);
		btnTan_1.setBounds(427, 128, 69, 31);
		contentPane.add(btnTan_1);
		
		JButton btnEx = new JButton("e");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops=(2.7182818285);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnEx.setForeground(Color.BLACK);
		btnEx.setBackground(Color.WHITE);
		btnEx.setBounds(427, 170, 69, 31);
		contentPane.add(btnEx);
		
		JButton btnLog_1 = new JButton("e^x");
		btnLog_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=(2.7182818285*ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnLog_1.setForeground(Color.BLACK);
		btnLog_1.setBackground(Color.WHITE);
		btnLog_1.setBounds(427, 212, 69, 31);
		contentPane.add(btnLog_1);
		
		JButton btnLn_1 = new JButton("ln");
		btnLn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.log10(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnLn_1.setForeground(Color.BLACK);
		btnLn_1.setBackground(Color.WHITE);
		btnLn_1.setBounds(427, 254, 69, 31);
		contentPane.add(btnLn_1);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.sinh(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setForeground(Color.BLACK);
		btnSinh.setBackground(Color.WHITE);
		btnSinh.setBounds(494, 86, 69, 31);
		contentPane.add(btnSinh);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.cosh(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnCosh.setForeground(Color.BLACK);
		btnCosh.setBackground(Color.WHITE);
		btnCosh.setBounds(494, 128, 69, 31);
		contentPane.add(btnCosh);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.tanh(ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnTanh.setForeground(Color.BLACK);
		btnTanh.setBackground(Color.WHITE);
		btnTanh.setBounds(494, 170, 69, 31);
		contentPane.add(btnTanh);
		
		JButton btnX_1 = new JButton("x!");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText(" ");
				ope="!";
			}
		});
		btnX_1.setForeground(Color.BLACK);
		btnX_1.setBackground(Color.WHITE);
		btnX_1.setBounds(494, 212, 69, 31);
		contentPane.add(btnX_1);
		
		JButton button_25 = new JButton("\u03C0");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops;
					ops=(3.141592653589793238);
					txtdisplay.setText(String.valueOf(ops));
			}
		});
		button_25.setForeground(Color.BLACK);
		button_25.setBackground(Color.WHITE);
		button_25.setBounds(494, 254, 69, 31);
		contentPane.add(button_25);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace=null;
				if (txtdisplay.getText().length()>0){
					StringBuilder strB=new StringBuilder(txtdisplay.getText());
					strB.deleteCharAt(txtdisplay.getText().length()-1);
					backspace=strB.toString();
					txtdisplay.setText(backspace);
				}
				
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(220, 86, 54, 31);
		contentPane.add(btnBack);
		
		JButton button_20 = new JButton("\u221A");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops=Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops=Math.sqrt(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		button_20.setForeground(Color.BLACK);
		button_20.setBackground(Color.WHITE);
		button_20.setBounds(220, 128, 54, 31);
		contentPane.add(button_20);
		
		JButton btnx_2 = new JButton("1/x");
		btnx_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fnum=Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText(" ");
				ope="1/x";
				
			}
		});
		btnx_2.setForeground(Color.BLACK);
		btnx_2.setBackground(Color.WHITE);
		btnx_2.setBounds(220, 170, 54, 31);
		contentPane.add(btnx_2);
		
		JButton button_24 = new JButton("=");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ans;
				//fnum=Double.parseDouble(txtdisplay.getText());
				snum=Double.parseDouble(txtdisplay.getText());
				
				if(ope=="+"){
					result=fnum+snum;
					ans=String.format("%.2f", result);
					txtdisplay.setText(ans);
				}
				else if(ope=="-"){
						result=fnum-snum;
						ans=String.format("%.2f", result);
						txtdisplay.setText(ans);	
				
				}
				else if(ope=="*"){
					result=fnum*snum;
					ans=String.format("%.2f", result);
					txtdisplay.setText(ans);
				}
				else if(ope=="/"){
					result=fnum/snum;
					ans=String.format("%.2f", result);
					txtdisplay.setText(ans);
				}
				else if(ope=="%"){
					result=fnum%snum;
					ans=String.format("%.2f", result);
					txtdisplay.setText(ans);
				}
				else if(ope=="1/x"){
					result=1/snum;
					ans=String.format("%.2f", result);
					txtdisplay.setText(ans);
				}
				else if(ope=="!"){
				for(double i=1;i<=fnum;i++){    
				      result=result*i;    
				  }    
				ans=String.format("%.2f", result);
				txtdisplay.setText(ans);
				
			}
				
			}
				
		});
		button_24.setForeground(Color.BLACK);
		button_24.setBackground(Color.WHITE);
		button_24.setBounds(220, 212, 54, 73);
		contentPane.add(button_24);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/calculator-clipart-child-1.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(476, 0, 251, 430);
		contentPane.add(lblNewLabel);
	}
}

