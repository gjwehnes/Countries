import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtCountryName;
	private JTextField txtCapital;
	private JTextField txtCurrency;
	private JTextField txtLanguage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Country Quiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFlag1 = new JButton("");
		btnFlag1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnFlag1_mouseClicked(arg0);
			}
		});
		btnFlag1.setIcon(new ImageIcon("res/canada.png"));
		btnFlag1.setBounds(10, 11, 60, 40);
		contentPane.add(btnFlag1);
		
		JButton btnFlag2 = new JButton("#2");
		btnFlag2.setBounds(80, 11, 60, 40);
		contentPane.add(btnFlag2);
		
		JButton btnFlag3 = new JButton("#3");
		btnFlag3.setBounds(150, 11, 60, 40);
		contentPane.add(btnFlag3);
		
		JButton btnFlag4 = new JButton("#4");
		btnFlag4.setBounds(220, 11, 60, 40);
		contentPane.add(btnFlag4);
		
		JButton btnFlag6 = new JButton("#6");
		btnFlag6.setBounds(10, 62, 60, 40);
		contentPane.add(btnFlag6);
		
		JButton btnFlag7 = new JButton("#7");
		btnFlag7.setBounds(80, 62, 60, 40);
		contentPane.add(btnFlag7);
		
		JButton btnFlag8 = new JButton("#8");
		btnFlag8.setBounds(150, 62, 60, 40);
		contentPane.add(btnFlag8);
		
		JButton btnFlag9 = new JButton("#9");
		btnFlag9.setBounds(220, 62, 60, 40);
		contentPane.add(btnFlag9);
		
		JButton btnFlag11 = new JButton("#11");
		btnFlag11.setBounds(10, 113, 60, 40);
		contentPane.add(btnFlag11);
		
		JButton btnFlag12 = new JButton("#12");
		btnFlag12.setBounds(80, 113, 60, 40);
		contentPane.add(btnFlag12);
		
		JButton btnFlag13 = new JButton("#13");
		btnFlag13.setBounds(150, 113, 60, 40);
		contentPane.add(btnFlag13);
		
		JButton btnFlag14 = new JButton("#14");
		btnFlag14.setBounds(220, 113, 60, 40);
		contentPane.add(btnFlag14);
		
		JButton btnFlag16 = new JButton("#16");
		btnFlag16.setBounds(10, 164, 60, 40);
		contentPane.add(btnFlag16);
		
		JButton btnFlag17 = new JButton("17");
		btnFlag17.setIcon(new ImageIcon("kilarge.gif"));
		btnFlag17.setBounds(80, 164, 60, 40);
		contentPane.add(btnFlag17);
		
		JButton btnFlag18 = new JButton("#18");
		btnFlag18.setBounds(150, 164, 60, 40);
		contentPane.add(btnFlag18);
		
		JButton btnFlag19 = new JButton("#19");
		btnFlag19.setBounds(220, 164, 60, 40);
		contentPane.add(btnFlag19);
		
		JButton btnFlag5 = new JButton("#5");
		btnFlag5.setBounds(290, 11, 60, 40);
		contentPane.add(btnFlag5);
		
		JButton btnFlag10 = new JButton("#10");
		btnFlag10.setBounds(290, 62, 60, 40);
		contentPane.add(btnFlag10);
		
		JButton btnFlag15 = new JButton("#15");
		btnFlag15.setBounds(290, 113, 60, 40);
		contentPane.add(btnFlag15);
		
		JButton btnFlag20 = new JButton("#20");
		btnFlag20.setBounds(290, 164, 60, 40);
		contentPane.add(btnFlag20);
		
		txtCountryName = new JTextField();
		txtCountryName.setBounds(80, 234, 270, 27);
		contentPane.add(txtCountryName);
		txtCountryName.setColumns(10);
		
		txtCapital = new JTextField();
		txtCapital.setColumns(10);
		txtCapital.setBounds(80, 272, 270, 27);
		contentPane.add(txtCapital);
		
		txtCurrency = new JTextField();
		txtCurrency.setColumns(10);
		txtCurrency.setBounds(80, 310, 270, 27);
		contentPane.add(txtCurrency);
		
		txtLanguage = new JTextField();
		txtLanguage.setColumns(10);
		txtLanguage.setBounds(80, 348, 270, 27);
		contentPane.add(txtLanguage);
		
		JLabel lblCountryName = new JLabel("Country");
		lblCountryName.setBounds(10, 240, 60, 14);
		contentPane.add(lblCountryName);
		
		JLabel lblCapital = new JLabel("Capital");
		lblCapital.setBounds(10, 278, 60, 14);
		contentPane.add(lblCapital);
		
		JLabel lblCurrency = new JLabel("Currency");
		lblCurrency.setBounds(10, 316, 60, 14);
		contentPane.add(lblCurrency);
		
		JLabel lblLanguages = new JLabel("Language");
		lblLanguages.setBounds(10, 354, 60, 14);
		contentPane.add(lblLanguages);
	}

	protected void btnFlag1_mouseClicked(MouseEvent arg0) {
		this.txtCountryName.setText("Canada");
		this.txtCapital.setText("Ottawa");
		this.txtCurrency.setText("Dollar");
		this.txtLanguage.setText("English, French");
	}
	protected void btnFlag17_mouseClicked(MouseEvent arg0) {
		this.txtCountryName.setText("Niger");
		this.txtCapital.setText("Niamey");
		this.txtCurrency.setText("Franc");
		this.txtLanguage.setText("French");
		
}
}
