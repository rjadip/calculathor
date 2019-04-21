package kalkulator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextPane;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Color;
import java.awt.SystemColor;

public class AboutMe extends Kalkulator
{

	JFrame formAbout;
	private final Panel panel = new Panel();
	private JTextPane CopyRight;
	private JTextPane Alvin;
	private JTextPane txtpnMalcolmSebastian;
	private JTextPane txtpnRiyanJayaAp;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe window = new AboutMe();
					window.formAbout.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutMe() {
		initialize();
	}
	private void initialize() {
		formAbout = new JFrame();
		formAbout.setTitle("About CalculaThor");
		formAbout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formAbout.getContentPane().setLayout(null);
		
		CopyRight = new JTextPane();
		CopyRight.setBounds(104, 11, 158, 20);
		CopyRight.setBackground(SystemColor.menu);
		CopyRight.setSelectedTextColor(Color.BLACK);
		CopyRight.setText("CalculaThor by Toko Obat Kuat");
		formAbout.getContentPane().add(CopyRight);
		
		Alvin = new JTextPane();
		Alvin.setBounds(104, 54, 69, 20);
		Alvin.setBackground(SystemColor.menu);
		Alvin.setSelectedTextColor(Color.BLACK);
		Alvin.setText("Alvin Hardian");
		formAbout.getContentPane().add(Alvin);
		
		
		txtpnMalcolmSebastian = new JTextPane();
		txtpnMalcolmSebastian.setBounds(104, 85, 93, 20);
		txtpnMalcolmSebastian.setBackground(SystemColor.menu);
		txtpnMalcolmSebastian.setSelectedTextColor(Color.BLACK);
		txtpnMalcolmSebastian.setText("Malcolm Sebastian");
		formAbout.getContentPane().add(txtpnMalcolmSebastian);
		
		txtpnRiyanJayaAp = new JTextPane();
		txtpnRiyanJayaAp.setBounds(104, 116, 120, 20);
		txtpnRiyanJayaAp.setBackground(SystemColor.menu);
		txtpnRiyanJayaAp.setSelectedTextColor(Color.BLACK);
		txtpnRiyanJayaAp.setText("Riyan Jaya Adi Pratama");
		formAbout.getContentPane().add(txtpnRiyanJayaAp);
		panel.setBounds(10, 142, 272, 43);
		
		formAbout.getContentPane().add(panel);
		panel.setLayout(null);
		
		Button buttonOk = new Button("OK");
		buttonOk.setBounds(95, 10, 70, 22);
		panel.add(buttonOk);

		//agar tidak bisa di Resize windowsnya
		formAbout.setResizable(false);
		formAbout.getFocusListeners();
		buttonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				formAbout.dispose();
			}
		});
		formAbout.setBounds(10, 65, 288, 217);
	}
}