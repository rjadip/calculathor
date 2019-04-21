/*
 * Copyright Riyan Jaya Adi Pratama
 * 
 * 
 */
package kalkulator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;

public class Kalkulator
{
	
	private JFrame frame;
	JFrame formUtama;
	private double total1 = 0.0;
	private double total2 = 0.0;
	private char oper_matematika;
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.formUtama.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	//Rumus.Hitung.KBTK=KaliBagiTambahKurang
	private void getOperator(String btnText)
	{
		oper_matematika = btnText.charAt(0);
		total1 = total1 + Double.parseDouble(TextTampilan.getText());
		TextTampilan.setText("");
	}
	
	public Kalkulator() {
		
		initialize();
	}
	private final JButton buttondectobinar = new JButton("0101");
	private final JMenu mnView = new JMenu("View");
	private JTextField TextTampilan;

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		formUtama = new JFrame();
		formUtama.setTitle("CalculaThor");
		//agar ngga bisa
		formUtama.setResizable(false);
		formUtama.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		formUtama.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		formUtama.setBounds(100, 100, 294, 312);
		formUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formUtama.getContentPane().setLayout(null);
		
		buttondectobinar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){ 
				
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		formUtama.getContentPane().add(menuBar);
		
		menuBar.add(mnView);
		
		JMenuItem mntmBinarycalculator = new JMenuItem("Binary Calculator");
		mntmBinarycalculator.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				
			}
		});
		mntmBinarycalculator.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				formUtama.dispose();
				BinaryDecimal window = new BinaryDecimal();
				window.formBinary.setVisible(true);
			}
		});
		mnView.add(mntmBinarycalculator);
		
		JMenuItem mntmHexaCalculator = new JMenuItem("Hexa Calculator");
		mntmHexaCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				formUtama.dispose();
				HexaDecimal window = new HexaDecimal();
				window.formHexa.setVisible(true);
			}
		});
		mnView.add(mntmHexaCalculator);
		
		JMenuItem mntmOctalCalculator = new JMenuItem("Octal Calculator");
		mntmOctalCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				formUtama.dispose();
				OctalDecimal window = new OctalDecimal();
				window.formOctal.setVisible(true);
			}
		});
		mnView.add(mntmOctalCalculator);
		
		JMenu MenuHelp = new JMenu("Help");
		menuBar.add(MenuHelp);
		
		JMenuItem SubMenuHelp = new JMenuItem("About");
		SubMenuHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AboutMe window = new AboutMe();
				window.formAbout.setVisible(true);
			}
		});
		SubMenuHelp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{

			}
		});
		MenuHelp.add(SubMenuHelp);
		
		JPanel panelAngka = new JPanel();
		panelAngka.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panelAngka.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panelAngka.setBounds(10, 65, 258, 209);
		formUtama.getContentPane().add(panelAngka);
		panelAngka.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn7Text=TextTampilan.getText()+btn7.getText();
				TextTampilan.setText(btn7Text);
			}
		});
		btn7.setBounds(7, 6, 50, 50);
		panelAngka.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn8Text=TextTampilan.getText()+btn8.getText();
				TextTampilan.setText(btn8Text);
			}
		});
		btn8.setBounds(56, 6, 50, 50);
		panelAngka.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn9Text=TextTampilan.getText()+btn9.getText();
				TextTampilan.setText(btn9Text);
			}
		});
		btn9.setBounds(105, 6, 50, 50);
		panelAngka.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(7, 55, 50, 50);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn4Text=TextTampilan.getText()+btn4.getText();
				TextTampilan.setText(btn4Text);
			}
		});
		panelAngka.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn5Text=TextTampilan.getText()+btn5.getText();
				TextTampilan.setText(btn5Text);
			}
		});
		btn5.setBounds(56, 55, 50, 50);
		panelAngka.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn6Text=TextTampilan.getText()+btn6.getText();
				TextTampilan.setText(btn6Text);
			}
		});
		btn6.setBounds(105, 55, 50, 50);
		panelAngka.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(7, 104, 50, 50);
		btn1.setMinimumSize(new Dimension(50, 50));
		btn1.setMaximumSize(new Dimension(50, 50));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn1Text=TextTampilan.getText()+btn1.getText();
				TextTampilan.setText(btn1Text);
			}
		});
		panelAngka.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(56, 104, 50, 50);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String btn2Text=TextTampilan.getText()+btn2.getText();
				TextTampilan.setText(btn2Text);
			}
		});
		panelAngka.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(105, 104, 50, 50);
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String btn3Text=TextTampilan.getText()+btn3.getText();
				TextTampilan.setText(btn3Text);
			}
		});
		panelAngka.add(btn3);
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						String btn0Text=TextTampilan.getText()+btn0.getText();
						TextTampilan.setText(btn0Text);
					}
				});
				btn0.setBounds(7, 153, 99, 51);
				panelAngka.add(btn0);
				
				JButton btnEqual = new JButton("=");
				
				
				//Button Deklarasi Bro, Biar Rapi//
				btnEqual.setBounds(203, 55, 50, 149);
				panelAngka.add(btnEqual);
				btnEqual.setActionCommand("Clear");
				
				JButton btnTambah = new JButton("+");
				btnTambah.setBounds(154, 153, 50, 51);
				panelAngka.add(btnTambah);
				
				JButton btnKali = new JButton("*");
				btnKali.setBounds(154, 55, 50, 50);
				panelAngka.add(btnKali);
				
				JButton btnKurang = new JButton("-");
				btnKurang.setBounds(154, 104, 50, 50);
				panelAngka.add(btnKurang);
				
				JButton btnBagi = new JButton("/");
				btnBagi.setBounds(154, 6, 50, 50);
				panelAngka.add(btnBagi);
				
				JButton btnAllClear = new JButton("AC");
				btnAllClear.setFont(new Font("Tahoma", Font.PLAIN, 9));
				btnAllClear.setBounds(203, 6, 50, 50);
				panelAngka.add(btnAllClear);
				btnAllClear.setActionCommand("Clear");
				
				JButton btnDot = new JButton(".");
				btnDot.setBounds(105, 153, 50, 51);
				panelAngka.add(btnDot);
				
				//ActionListener Fungsi Bro//
				//Biar Rapi//
				btnAllClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						total2 = 0;
						TextTampilan.setText("");
					}
				});
				
				btnDot.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String btnDotText=TextTampilan.getText()+btnDot.getText();
						TextTampilan.setText(btnDotText);
					}
				});
				
				btnKurang.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String button_text = btnKurang.getText();
						getOperator(button_text);
					}
				});
				
				btnKali.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String button_text = btnKali.getText();
						getOperator(button_text);
					}
				});
				
				btnBagi.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String button_text = btnBagi.getText();
						getOperator(button_text);				
					}
				});
				
				btnTambah.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String button_text = btnTambah.getText();
						getOperator(button_text);
					}
				});
				
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						switch (oper_matematika)
						{
						case '+':
							total2 = total1 + Double.parseDouble(TextTampilan.getText());
							break;
						case '-':
							total2 = total1 - Double.parseDouble(TextTampilan.getText());
							break;
						case '/':
							total2 = total1 / Double.parseDouble(TextTampilan.getText());
							break;
						case '*':
							total2 = total1 * Double.parseDouble(TextTampilan.getText());
							break;
						}
						TextTampilan.setText(Double.toString(total2));
						total1=0;
					}				
				});
				
				TextTampilan = new JTextField();
				TextTampilan.setEditable(false);
				TextTampilan.setBounds(10, 25, 258, 29);
				formUtama.getContentPane().add(TextTampilan);
				TextTampilan.setColumns(10);
	}
}