package kalkulator;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;

public class HexaDecimal extends Kalkulator
{
	
	JFrame formHexa;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HexaDecimal window = new HexaDecimal();
					window.formHexa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public HexaDecimal() {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		initialize();
	}

	JButton btn1 = new JButton("1");
	private final JTextField TextInput = new JTextField();
	private final JButton btn2 = new JButton("2");
	private final JButton btn3 = new JButton("3");
	private final JButton btnHexax = new JButton("To Hexa");
	private final JButton btn4 = new JButton("4");
	private final JButton btn5 = new JButton("5");
	private final JButton btn6 = new JButton("6");
	private final JButton btn7 = new JButton("7");
	private final JButton btn8 = new JButton("8");
	private final JButton btn9 = new JButton("9");
	private final JTextField TextOutput = new JTextField();
	private final JButton btn0 = new JButton("0");
	private final JButton btnNewButton = new JButton("CE");
	private final JButton btnDecimal = new JButton("To Decimal");
	private final JButton buttonC = new JButton("C");
	private final JButton buttonD = new JButton("D");
	private final JButton buttonA = new JButton("A");
	private final JButton buttonE = new JButton("E");
	private final JButton buttonF = new JButton("F");
	private final JButton buttonB = new JButton("B");
	private final JMenuItem mntmBinaryCalculator = new JMenuItem("Binary Calculator");
	private final JMenuItem mntmOctalCalculator = new JMenuItem("Octal Calculator");
	
	private void initialize() {
		formHexa = new JFrame();
		formHexa.setTitle("CalculaThor");
		formHexa.setBounds(100, 100, 332, 366);
		formHexa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formHexa.getContentPane().setLayout(null);
		//agar tidak bisa di Resize windowsnya
		formHexa.setResizable(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String btn1Text=TextInput.getText()+btn1.getText();
				TextInput.setText(btn1Text);
			}
		});
		TextInput.setEditable(false);
		TextInput.setBounds(10, 23, 295, 20);
		TextInput.setColumns(10);
		
		formHexa.getContentPane().add(TextInput);
		TextOutput.setEditable(false);
		TextOutput.setColumns(10);
		TextOutput.setBounds(10, 43, 295, 20);
		
		formHexa.getContentPane().add(TextOutput);
		
		
		btn1.setBounds(10, 224, 50, 50);
		formHexa.getContentPane().add(btn1);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn2Text=TextInput.getText()+btn2.getText();
				TextInput.setText(btn2Text);
			}
		});
		btn2.setBounds(59, 224, 50, 50);
		
		formHexa.getContentPane().add(btn2);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn3Text=TextInput.getText()+btn3.getText();
				TextInput.setText(btn3Text);
			}
		});
		btn3.setBounds(108, 224, 50, 50);
		
		formHexa.getContentPane().add(btn3);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn4Text=TextInput.getText()+btn4.getText();
				TextInput.setText(btn4Text);
			}
		});
		btn4.setBounds(10, 175, 50, 50);
		
		formHexa.getContentPane().add(btn4);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn5Text=TextInput.getText()+btn5.getText();
				TextInput.setText(btn5Text);
			}
		});
		btn5.setBounds(59, 175, 50, 50);
		
		formHexa.getContentPane().add(btn5);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn6Text=TextInput.getText()+btn6.getText();
				TextInput.setText(btn6Text);
			}
		});
		btn6.setBounds(108, 175, 50, 50);
		
		formHexa.getContentPane().add(btn6);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn7Text=TextInput.getText()+btn7.getText();
				TextInput.setText(btn7Text);
			}
		});
		btn7.setBounds(10, 126, 50, 50);
		
		formHexa.getContentPane().add(btn7);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn8Text=TextInput.getText()+btn8.getText();
				TextInput.setText(btn8Text);
			}
		});
		btn8.setBounds(59, 126, 50, 50);
		
		formHexa.getContentPane().add(btn8);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn9Text=TextInput.getText()+btn9.getText();
				TextInput.setText(btn9Text);
			}
		});
		btn9.setBounds(108, 126, 50, 50);
		
		formHexa.getContentPane().add(btn9);
		btnHexax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnHexax.setBounds(206, 224, 99, 99);
		
		formHexa.getContentPane().add(btnHexax);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		formHexa.getContentPane().add(menuBar);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenuItem mntmBasicCalculator = new JMenuItem("Basic Calculator");
		mntmBasicCalculator.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				formHexa.dispose();
				Kalkulator window = new Kalkulator();
				window.formUtama.setVisible(true);
			}
		});
		mnView.add(mntmBasicCalculator);
		mntmBinaryCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				formHexa.dispose();
				BinaryDecimal window = new BinaryDecimal();
				window.formBinary.setVisible(true);
			}
		});
		
		mnView.add(mntmBinaryCalculator);
		mntmOctalCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				formHexa.dispose();
				OctalDecimal window = new OctalDecimal();
				window.formOctal.setVisible(true);
			}
		});
		
		mnView.add(mntmOctalCalculator);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn0Text=TextInput.getText()+btn0.getText();
				TextInput.setText(btn0Text);
			}
		});
		btn0.setBounds(10, 273, 197, 50);
		
		formHexa.getContentPane().add(btn0);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextInput.setText("");
				TextOutput.setText("");
			}
		});
		btnNewButton.setBounds(157, 224, 50, 50);
		formHexa.getContentPane().add(buttonB);
		btnHexax.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{				
				try
				{
				      //Scanner inputA = new Scanner(System.in);
				      int input = Integer.parseInt(TextInput.getText());
				      //Memanggil metode Hexa()
				      String str = Integer.toHexString(input);
				      String Output = "";
				      {
				    	  Output += String.valueOf(str);
				      }
				      TextOutput.setText(Output);
				}
				catch(NumberFormatException e1)
				{
					JOptionPane.showMessageDialog(null, "Please fill the form and use integer only");
				}
			}
		});
		formHexa.getContentPane().add(btnNewButton);
		btnDecimal.addActionListener(new ActionListener() {
			private Scanner input;

			public void actionPerformed(ActionEvent e)
			{
					try
					{
						String input2 = TextInput.getText();
						input = new Scanner(input2);
						
						String inputHex = input.nextLine();
						// Hexa ke Decimal kode output
						String Output = "";
						{
						Output += Integer.parseInt(inputHex,16);
						}
						TextOutput.setText(Output);
							
					}
					catch(NumberFormatException ne)
					{
						// Printing a warning message if the input is not a valid hex number
						JOptionPane.showMessageDialog(null, "Invalid Input");
					}
			}
		});
		btnDecimal.setBounds(157, 126, 148, 99);
		
		formHexa.getContentPane().add(btnDecimal);
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String buttonCText=TextInput.getText()+buttonC.getText();
				TextInput.setText(buttonCText);
			}
		});
		buttonC.setBounds(108, 65, 50, 50);
		
		formHexa.getContentPane().add(buttonC);
		buttonD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String buttonDText=TextInput.getText()+buttonD.getText();
				TextInput.setText(buttonDText);
			}
		});
		buttonD.setBounds(157, 65, 50, 50);
		
		formHexa.getContentPane().add(buttonD);
		buttonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String buttonAText=TextInput.getText()+buttonA.getText();
				TextInput.setText(buttonAText);	
			}
		});
		buttonA.setBounds(10, 65, 50, 50);
		
		formHexa.getContentPane().add(buttonA);
		buttonE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String buttonEText=TextInput.getText()+buttonE.getText();
				TextInput.setText(buttonEText);
			}
		});
		buttonE.setBounds(206, 65, 50, 50);
		
		formHexa.getContentPane().add(buttonE);
		buttonF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String buttonFText=TextInput.getText()+buttonF.getText();
				TextInput.setText(buttonFText);
			}
		});
		buttonF.setBounds(255, 65, 50, 50);
		
		formHexa.getContentPane().add(buttonF);
		buttonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String buttonBText=TextInput.getText()+buttonB.getText();
				TextInput.setText(buttonBText);
			}
		});
		buttonB.setBounds(59, 65, 50, 50);
		
		
	}
}