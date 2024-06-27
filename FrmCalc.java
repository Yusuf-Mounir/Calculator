import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FrmCalc extends JFrame {

	
	
	
	private JPanel contentPane;
	private JTextField txtAll;

	/**
	 * Launch the application.
	 */
	
	double first_num;
	double second_num;
	double result;
	String operation;
	String binary, octal, hexadecimal; 
	private JButton btnRoot;
	private void Set_Entered(String entered_num) {
		String num = txtAll.getText() + entered_num;
		txtAll.setText(num);
	}
	
	private void Do_Operation(String entered_ope) {
		first_num = Double.parseDouble(txtAll.getText());
		txtAll.setText("");
		operation = entered_ope;
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCalc frame = new FrmCalc();
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
	public FrmCalc() {
		addWindowListener(new WindowAdapter() {
			public void windowIconified(WindowEvent e) {
				
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Downloads\\f19c7e914f0adb59c0833d00d09f1ea7.png"));
		setTitle("Calculator");
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 799);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAll = new JTextField();
		txtAll.setForeground(new Color(0, 0, 0));
		txtAll.setBackground(new Color(192, 192, 192));
		txtAll.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAll.setFont(new Font("Tahoma", Font.PLAIN, 50));
		txtAll.setBounds(10, 30, 474, 132);
		contentPane.add(txtAll);
		txtAll.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(192, 192, 192));
		btn7.setBackground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered("7");
			}
		});
		btn7.setBounds(10, 411, 72, 61);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered("8");
			}
		});
		btn8.setForeground(new Color(192, 192, 192));
		btn8.setBackground(new Color(0, 0, 0));
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn8.setBounds(92, 411, 72, 61);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered("9");
			}
		});
		btn9.setForeground(new Color(192, 192, 192));
		btn9.setBackground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn9.setBounds(178, 411, 72, 61);
		contentPane.add(btn9);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered("5");
			}
		});
		btn5.setForeground(new Color(192, 192, 192));
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn5.setBackground(new Color(0, 0, 0));
		btn5.setBounds(92, 493, 72, 61);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered("6");
			}
		});
		btn6.setForeground(new Color(192, 192, 192));
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn6.setBackground(new Color(0, 0, 0));
		btn6.setBounds(178, 493, 72, 61);
		contentPane.add(btn6);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Set_Entered("4");
			}
		});
		btn4.setForeground(new Color(192, 192, 192));
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn4.setBackground(new Color(0, 0, 0));
		btn4.setBounds(10, 493, 72, 61);
		contentPane.add(btn4);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered("2");
			}
		});
		btn2.setForeground(new Color(192, 192, 192));
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn2.setBackground(new Color(0, 0, 0));
		btn2.setBounds(92, 575, 72, 61);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(192, 192, 192));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered("3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn3.setBackground(new Color(0, 0, 0));
		btn3.setBounds(178, 575, 72, 61);
		contentPane.add(btn3);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered("1");
			}
		});
		btn1.setForeground(new Color(192, 192, 192));
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn1.setBackground(new Color(0, 0, 0));
		btn1.setBounds(10, 575, 72, 61);
		contentPane.add(btn1);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered(".");
			}
		});
		btnDot.setForeground(new Color(192, 192, 192));
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDot.setBackground(new Color(0, 0, 0));
		btnDot.setBounds(92, 665, 72, 88);
		contentPane.add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				second_num = Double.parseDouble(txtAll.getText());
			
				
				if(operation == "+")
					result = first_num + second_num;
				else if(operation == "-")
					result = first_num - second_num;
				else if(operation == "*")
					result = first_num * second_num;
				else if(operation == "÷")
					result = first_num / second_num;
				else if(operation == "Mod")
					result = first_num % second_num;
				else if(operation == "X^n") {
					result = 1;
					for(int i = 0; i < second_num; ++i) {
						result *= first_num;
					}
				}
				double is_int = result - (int)result;
				if(is_int == 0)
				txtAll.setText(String.valueOf((int)result)) ;
				
				else
				txtAll.setText(String.valueOf(result)) ;
				
				
				
				
			}
		});
		btnEqual.setForeground(new Color(0, 0, 0));
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnEqual.setBackground(new Color(128, 128, 128));
		btnEqual.setBounds(365, 666, 119, 86);
		contentPane.add(btnEqual);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Set_Entered("0");
			}
		});
		btn0.setForeground(new Color(192, 192, 192));
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn0.setBackground(new Color(0, 0, 0));
		btn0.setBounds(10, 665, 72, 87);
		contentPane.add(btn0);
		
		JButton btnMul = new JButton("×");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Do_Operation("*");
			}
		});
		btnMul.setForeground(new Color(0, 0, 0));
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMul.setBackground(new Color(128, 128, 128));
		btnMul.setBounds(287, 575, 59, 61);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Do_Operation("÷");
			}
		});
		btnDiv.setForeground(new Color(0, 0, 0));
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDiv.setBackground(new Color(128, 128, 128));
		btnDiv.setBounds(287, 493, 59, 61);
		contentPane.add(btnDiv);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Do_Operation("+");
			}
		});
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAdd.setBackground(new Color(128, 128, 128));
		btnAdd.setBounds(356, 575, 59, 61);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Do_Operation("-");
			}
		});
		btnSub.setForeground(new Color(0, 0, 0));
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSub.setBackground(new Color(128, 128, 128));
		btnSub.setBounds(425, 575, 59, 61);
		contentPane.add(btnSub);
		
		JButton btnReverse = new JButton("+/-");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(txtAll.getText());
				
				if(num != 0)
				num = num * (-1);
				else
				num = num;
				txtAll.setText(String.valueOf(num));
			}
		});
		btnReverse.setForeground(new Color(192, 192, 192));
		btnReverse.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnReverse.setBackground(Color.BLACK);
		btnReverse.setBounds(178, 665, 72, 87);
		contentPane.add(btnReverse);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAll.setText("");
			}
		});
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnClear.setBackground(new Color(255, 0, 0));
		btnClear.setBounds(283, 411, 201, 61);
		contentPane.add(btnClear);
		
		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t = Math.exp(Double.parseDouble(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + t);
			}
		});
		btnExp.setForeground(Color.LIGHT_GRAY);
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnExp.setBackground(Color.BLACK);
		btnExp.setBounds(260, 665, 94, 87);
		contentPane.add(btnExp);
		
		JButton btnBackChar = new JButton("DEL");
		btnBackChar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String back_space = null;
				if(txtAll.getText().length() > 0) {
					
					StringBuilder s = new StringBuilder(txtAll.getText());
					s.deleteCharAt(txtAll.getText().length() - 1);
					back_space = s.toString();
					txtAll.setText(back_space);
					
				}
				
			}
		});
		btnBackChar.setForeground(Color.BLACK);
		btnBackChar.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnBackChar.setBackground(Color.RED);
		btnBackChar.setBounds(355, 493, 129, 61);
		contentPane.add(btnBackChar);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t = Math.sin(Double.parseDouble(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + t);
				
			}
		});
		btnSin.setForeground(new Color(192, 192, 192));
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSin.setBackground(new Color(0, 0, 0));
		btnSin.setBounds(92, 334, 124, 61);
		contentPane.add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t = Math.cos(Double.parseDouble(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + t);
			}
		});
		btnCos.setForeground(new Color(192, 192, 192));
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCos.setBackground(new Color(0, 0, 0));
		btnCos.setBounds(226, 334, 124, 61);
		contentPane.add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t = Math.tan(Double.parseDouble(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + t);
			}
		});
		btnTan.setForeground(new Color(192, 192, 192));
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnTan.setBackground(new Color(0, 0, 0));
		btnTan.setBounds(360, 334, 124, 61);
		contentPane.add(btnTan);
		
		JButton btnX_Inverse = new JButton("1/x");
		btnX_Inverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t = 1 / (Double.parseDouble(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + t);
			}
		});
		btnX_Inverse.setForeground(Color.LIGHT_GRAY);
		btnX_Inverse.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnX_Inverse.setBackground(Color.BLACK);
		btnX_Inverse.setBounds(10, 334, 72, 61);
		contentPane.add(btnX_Inverse);
		
		JButton btnOct = new JButton("Oct");
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				octal = Integer.toOctalString(Integer.parseInt(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + octal);
			}
		});
		btnOct.setForeground(Color.LIGHT_GRAY);
		btnOct.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnOct.setBackground(Color.BLACK);
		btnOct.setBounds(360, 263, 124, 61);
		contentPane.add(btnOct);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				hexadecimal = Integer.toHexString(Integer.parseInt(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + hexadecimal);
			}
		});
		btnHex.setForeground(Color.LIGHT_GRAY);
		btnHex.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHex.setBackground(Color.BLACK);
		btnHex.setBounds(226, 263, 124, 61);
		contentPane.add(btnHex);
		
		JButton btnXpowerN = new JButton("X^n");
		btnXpowerN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Do_Operation("X^n");
				
				
			}
		});
		btnXpowerN.setForeground(Color.LIGHT_GRAY);
		btnXpowerN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXpowerN.setBackground(new Color(0, 0, 0));
		btnXpowerN.setBounds(10, 263, 72, 61);
		contentPane.add(btnXpowerN);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				binary = Integer.toBinaryString(Integer.parseInt(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + binary);
			}
		});
		btnBin.setForeground(Color.LIGHT_GRAY);
		btnBin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBin.setBackground(Color.BLACK);
		btnBin.setBounds(92, 263, 124, 61);
		contentPane.add(btnBin);
		
		btnRoot = new JButton("Sqrt");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t = Math.sqrt(Double.parseDouble(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + t);
			}
		});
		btnRoot.setForeground(Color.LIGHT_GRAY);
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnRoot.setBackground(Color.BLACK);
		btnRoot.setBounds(360, 192, 124, 61);
		contentPane.add(btnRoot);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t = Math.log(Double.parseDouble(txtAll.getText()));
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + t);
			}
		});
		btnLog.setForeground(Color.LIGHT_GRAY);
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLog.setBackground(Color.BLACK);
		btnLog.setBounds(226, 192, 124, 61);
		contentPane.add(btnLog);
		
		JButton btnxPct = new JButton("Mod");
		btnxPct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Do_Operation("Mod");
				
			}
		});
		btnxPct.setForeground(new Color(192, 192, 192));
		btnxPct.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnxPct.setBackground(Color.BLACK);
		btnxPct.setBounds(92, 192, 124, 61);
		contentPane.add(btnxPct);
		
		JButton btnFactorial = new JButton("n!");
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double t=Double.parseDouble(txtAll.getText());
				
				int fact = 1;
				while(t != 0) {
					fact *= t;
					t--;
				}
				txtAll.setText("");
				txtAll.setText(txtAll.getText() + fact);
				
				
			}
		});
		btnFactorial.setForeground(Color.LIGHT_GRAY);
		btnFactorial.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnFactorial.setBackground(Color.BLACK);
		btnFactorial.setBounds(10, 192, 72, 61);
		contentPane.add(btnFactorial);
	}
}
