import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class bomber {

	public static void main(String[] args) {
		

	}

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
			
			for(int i = 0;(i <= amount);i++) {
				Transport.send(message);
				Thread.sleep(waitTime * 1000);;
			}

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
