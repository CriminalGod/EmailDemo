package com.cfss;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class Demo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Outgoing Mail (SMTP) Server requires TLS or SSL: smtp.gmail.com (use
		 * authentication) Use Authentication: Yes Port for TLS/STARTTLS: 587
		 */

		final String fromEmail = "rakeshkumar.t@apcfss.in"; // requires valid gmail id
		final String password = "Cfss9@9701"; // correct password for gmail id final
		String toEmail = "rakeshkumarthota1146@gmail.com"; // can be any email id

		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp-mail.outlook.com"); // SMTP Host
		props.put("mail.smtp.port", "587");// TLS Port
		props.put("mail.smtp.auth", "true"); // enable authentication
		props.put("mail.smtp.starttls.enable", "true"); // enable STARTTLS

		// create Authenticator object to pass in Session.getInstance argument
		Authenticator auth = new Authenticator() {
			// override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getInstance(props, auth);

		EmailUtil.sendEmail(session, toEmail, "TLSEmail Testing Subject", "TLSEmail Testing Body");
	}

	/*
	 * String host = "smtp.gmail.com"; final String user =
	 * "rakeshkumar.t@apcfss.in";// change accordingly final String password =
	 * "Cfss9@9701";// change accordingly
	 * 
	 * String to = "rakeshkumarthota1146@gmail.com";// change accordingly
	 * 
	 * // Get the session object Properties props = new Properties();
	 * props.put("mail.smtp.host", host); props.setProperty("mail.smtp.port",
	 * "587"); props.put("mail.smtp.auth", "true");
	 * 
	 * Session session1 = Session.getDefaultInstance(props, new
	 * javax.mail.Authenticator() { protected PasswordAuthentication
	 * getPasswordAuthentication() { return new PasswordAuthentication(user,
	 * password); } });
	 * 
	 * // Compose the message try { MimeMessage message = new MimeMessage(session1);
	 * message.setFrom(new InternetAddress(user));
	 * message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	 * message.setSubject("Ticket Forwarded");
	 * message.setText("Ticket has forwarded to you. Please Check...");
	 * 
	 * // send the message Transport.send(message);
	 * 
	 * System.out.println("message sent successfully...");
	 * 
	 * } catch (MessagingException e) { e.printStackTrace(); }
	 */
//	    
}
