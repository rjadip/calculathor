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

public class OctalDecimal extends Kalkulator
{
	
	JFrame formOctal;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OctalDecimal window = new OctalDecimal();
					window.formOctal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public OctalDecimal() {
		initialize();
	}

	JButton btn1 = new JButton("1");
	private final JTextField TextInput = new JTextField();
	private final JButton btn2 = new JButton("2");
	private final JButton btn3 = new JButton("3");
	private final JButton btnOctal = new JButton("To Octal");
	private final JButton btn4 = new JButton("4");
	private final JButton btn5 = new JButton("5");
	private final JButton btn6 = new JButton("6");
	private final JButton btn7 = new JButton("7");
	private final JButton btn8 = new JButton("8");
	private final JButton btn9 = new JButton("9");
	private final JTextField TextOutput = new JTextField();
	private final JButton btn0 = new JButton("0");
	private final JButton btnNewButton = new JButton("Clear");
	
	private void initialize() {
		formOctal = new JFrame();
		formOctal.setTitle("CalculaThor");
		formOctal.setBounds(100, 100, 282, 323);
		formOctal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formOctal.getContentPane().setLayout(null);
		//agar tidak bisa di Resize windowsnya
		formOctal.setResizable(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String btn1Text=TextInput.getText()+btn1.getText();
				TextInput.setText(btn1Text);
			}
		});
		TextInput.setEditable(false);
		TextInput.setBounds(10, 23, 246, 20);
		TextInput.setColumns(10);
		
		formOctal.getContentPane().add(TextInput);
		TextOutput.setEditable(false);
		TextOutput.setColumns(10);
		TextOutput.setBounds(10, 43, 246, 20);
		
		formOctal.getContentPane().add(TextOutput);
		
		
		btn1.setBounds(10, 171, 50, 50);
		formOctal.getContentPane().add(btn1);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn2Text=TextInput.getText()+btn2.getText();
				TextInput.setText(btn2Text);
			}
		});
		btn2.setBounds(59, 171, 50, 50);
		
		formOctal.getContentPane().add(btn2);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn3Text=TextInput.getText()+btn3.getText();
				TextInput.setText(btn3Text);
			}
		});
		btn3.setBounds(108, 171, 50, 50);
		
		formOctal.getContentPane().add(btn3);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn4Text=TextInput.getText()+btn4.getText();
				TextInput.setText(btn4Text);
			}
		});
		btn4.setBounds(10, 122, 50, 50);
		
		formOctal.getContentPane().add(btn4);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn5Text=TextInput.getText()+btn5.getText();
				TextInput.setText(btn5Text);
			}
		});
		btn5.setBounds(59, 122, 50, 50);
		
		formOctal.getContentPane().add(btn5);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn6Text=TextInput.getText()+btn6.getText();
				TextInput.setText(btn6Text);
			}
		});
		btn6.setBounds(108, 122, 50, 50);
		
		formOctal.getContentPane().add(btn6);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn7Text=TextInput.getText()+btn7.getText();
				TextInput.setText(btn7Text);
			}
		});
		btn7.setBounds(10, 73, 50, 50);
		
		formOctal.getContentPane().add(btn7);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn8Text=TextInput.getText()+btn8.getText();
				TextInput.setText(btn8Text);
			}
		});
		btn8.setBounds(59, 73, 50, 50);
		
		formOctal.getContentPane().add(btn8);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn9Text=TextInput.getText()+btn9.getText();
				TextInput.setText(btn9Text);
			}
		});
		btn9.setBounds(108, 73, 50, 50);
		
		formOctal.getContentPane().add(btn9);
		btnOctal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnOctal.setBounds(157, 171, 99, 99);
		
		formOctal.getContentPane().add(btnOctal);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		formOctal.getContentPane().add(menuBar);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenuItem mntmBasicCalculator = new JMenuItem("Basic Calculator");
		mntmBasicCalculator.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				formOctal.dispose();
				Kalkulator window = new Kalkulator();
				window.formUtama.setVisible(true);
			}
		});
		mnView.add(mntmBasicCalculator);
		
		JMenuItem mntmHexaCalculator = new JMenuItem("Hexa Calculator");
		mntmHexaCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				formOctal.dispose();
				HexaDecimal window = new HexaDecimal();
				window.formHexa.setVisible(true);
			}
		});
		
		JMenuItem mntmBinaryCalculator = new JMenuItem("Binary Calculator");
		mntmBinaryCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				formOctal.dispose();
				BinaryDecimal window = new BinaryDecimal();
				window.formBinary.setVisible(true);
			}
		});
		mnView.add(mntmBinaryCalculator);
		mnView.add(mntmHexaCalculator);
		
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
		btn0.setBounds(10, 220, 148, 50);
		
		formOctal.getContentPane().add(btn0);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextInput.setText("");
				TextOutput.setText("");
			}
		});
		btnNewButton.setBounds(157, 73, 99, 50);
		
		formOctal.getContentPane().add(btnNewButton);
		
		JButton ButtonDecimal = new JButton("To Decimal");
		ButtonDecimal.addActionListener(new ActionListener() {
			private Scanner s;

			public void actionPerformed(ActionEvent e)
			{
				{
					
					

					try
					{
						String input = TextInput.getText();
						s = new Scanner(input);
						String inputOct = s.nextLine();
						String Output = "";
						{
							Output += Integer.parseInt(inputOct, 8);
						}
						TextOutput.setText(Output);
					}
					catch(NumberFormatException ne)
					{
						JOptionPane.showMessageDialog(null, "Invalid Input, Expecting octal number 0-7");
					}
				}
			}
		});
		ButtonDecimal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ButtonDecimal.setBounds(157, 122, 99, 50);
		formOctal.getContentPane().add(ButtonDecimal);
		btnOctal.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{				
				try
				{
				      int num1 = Integer.parseInt(TextInput.getText());
				      
				      // Memanggil metode Hexa()
				      String str = Integer.toOctalString(num1);
				      String output = "";
				      {
				    	  output += String.valueOf(str);
				      }
				      TextOutput.setText(output);
				}
				catch(NumberFormatException e1)
				{
					JOptionPane.showMessageDialog(null, "Please fill the form and use integer only or too much");
				}
			}
		});
	}
}