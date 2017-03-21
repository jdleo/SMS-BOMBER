import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import javax.mail.*;
import java.util.Properties;

public class Bomber {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bomber window = new Bomber();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bomber() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBackground(SystemColor.textHighlight);
		frame.setForeground(SystemColor.textHighlight);
		frame.getContentPane().setForeground(SystemColor.textHighlight);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGmailUsername = new JLabel("Gmail Username:");
		lblGmailUsername.setFont(new Font("Futura PT Book", Font.PLAIN, 18));
		lblGmailUsername.setBounds(12, 121, 128, 16);
		frame.getContentPane().add(lblGmailUsername);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("Futura PT Light", Font.PLAIN, 18));
		formattedTextField.setBounds(152, 116, 433, 27);
		frame.getContentPane().add(formattedTextField);
		
		JLabel lblNewLabel = new JLabel("Gmail Password:");
		lblNewLabel.setFont(new Font("Futura PT Book", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 164, 122, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setFont(new Font("Futura PT Light", Font.PLAIN, 18));
		formattedTextField_1.setBounds(152, 156, 433, 27);
		frame.getContentPane().add(formattedTextField_1);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setForeground(SystemColor.desktop);
		
		btnNewButton.setFont(new Font("Futura PT Medium", Font.PLAIN, 24));
		btnNewButton.setBounds(192, 524, 262, 80);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("John's SMS Bomber");
		lblNewLabel_1.setFont(new Font("Futura PT Medium", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(192, 26, 294, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("http://github.com/jdleo");
		lblNewLabel_2.setFont(new Font("Futura PT Light", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(192, 66, 247, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ATT", "Verizon", "Sprint", "T-Mobile", "Virgin Mobile", "Other"}));
		
		comboBox.setFont(new Font("Futura PT Light", Font.PLAIN, 16));
		comboBox.setBounds(117, 240, 139, 22);
		frame.getContentPane().add(comboBox);
		
		
		JLabel lblTheirCarrier = new JLabel("Their Carrier:");
		lblTheirCarrier.setFont(new Font("Futura PT Book", Font.PLAIN, 18));
		lblTheirCarrier.setBounds(12, 243, 93, 16);
		frame.getContentPane().add(lblTheirCarrier);
		
		JLabel lblNewLabel_3 = new JLabel("Their Number:");
		lblNewLabel_3.setFont(new Font("Futura PT Book", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(322, 243, 124, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Futura PT Light", Font.PLAIN, 18));
		textField.setBounds(432, 240, 188, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Subject:");
		lblNewLabel_4.setFont(new Font("Futura PT Book", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(83, 295, 56, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 324, 218, 66);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(382, 324, 218, 66);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Message Body:");
		lblNewLabel_5.setFont(new Font("Futura PT Book", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(432, 295, 122, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(" AMOUNT:");
		lblNewLabel_6.setFont(new Font("Futura PT Medium", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(12, 432, 106, 25);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Futura PT Light", Font.PLAIN, 18));
		textField_3.setText("5");
		textField_3.setBounds(114, 432, 116, 27);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("WAIT TIME:");
		lblNewLabel_7.setFont(new Font("Futura PT Medium", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(322, 437, 93, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setText("1");
		textField_4.setFont(new Font("Futura PT Light", Font.PLAIN, 18));
		textField_4.setBounds(412, 433, 122, 25);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblinSeconds = new JLabel("(in seconds)");
		lblinSeconds.setBounds(370, 457, 91, 27);
		frame.getContentPane().add(lblinSeconds);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final String att_gate = "";
				final String verizon_gate = "";
				final String sprint_gate = "";
				final String tmobile_gate = "";
				final String virgin_gate ="";
				
				if (!formattedTextField.getText().equals("") && !formattedTextField_1.getText().equals("")) {
					
					EmailClient ec = new EmailClient(formattedTextField.getText(),formattedTextField_1.getText());
					
					// public void send(String toEmail, String subjectMsg, String msg, int amount)
					//indexes { 0: ATT 1: Verizon 2: Sprint 3: T-Mobile 4: 4: Virgin }
					String mms_gateway;
					switch(comboBox.getSelectedIndex()) {
					case 0:
						mms_gateway = "@txt.att.net";
						break;
					case 1:
						mms_gateway = "@vtext.com";
						break;
					case 2:
						mms_gateway = "@messaging.sprintpcs.com";
						break;
					case 3:
						mms_gateway = "@tmomail.net";
						break;
					case 4:
						mms_gateway = "@vmobl.com";
						break;
					default:
						mms_gateway = JOptionPane.showInputDialog("Enter in their mms email @email.com format");
					
					}
					
					String theirEmail = textField.getText() + mms_gateway;
					try {
						ec.send(theirEmail, textField_1.getText(), textField_2.getText(), Integer.parseInt(textField_3.getText()), Long.parseLong(textField_4.getText()));
					} catch (NumberFormatException | InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} else {
					JOptionPane.showMessageDialog(null, "All fields must be filled out! >:(");
				}
				
				
			}
		});
		frame.setResizable(false);
		frame.setBounds(100, 100, 650, 650);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class EmailClient {
		private String myEmail, myPassword;

		public EmailClient(String myEmail, String myPassword) {
			super();
			this.myEmail = myEmail;
			this.myPassword = myPassword;
		}
		
		public void send(String toEmail, String subjectMsg, String msg, int amount, long waitTime) throws InterruptedException {
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			
			Session session = Session.getInstance(props,
					  new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							PasswordAuthentication pA = new PasswordAuthentication(myEmail, myPassword);
							return pA;
							
						}
					  });
			
			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(myEmail));
				message.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse(toEmail));
				message.setSubject(subjectMsg);
				message.setText(msg);
				
				for(int i = 0;(i < amount);i++) {
					Transport.send(message);
					Thread.sleep(waitTime * 1000);
				}
				
				JOptionPane.showMessageDialog(null, String.format("%s texts sent to %s", amount, toEmail));

			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
