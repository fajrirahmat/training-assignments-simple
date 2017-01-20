package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
	public void buildAndSendMail(MailMan m, Mail mail, String... message)
	{
        // Format the email address
		String mId = mail.getPerson().getFirstName().charAt(0) + "." + mail.getPerson().getLastName().substring(0, 7) + "@" + mail.getPerson().getDivision().substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
		MailMessage mMessage = formatMessage(mail.getFont(),
            message[0] + message[1] + message[2]);
        // Send message
		m.send(mId, mail.getSubject(), mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }
    
    private class Mail{
    	private Person person;
    	private String subject;
    	private MailFont font;
		public Person getPerson()
		{
			return person;
		}
		public void setPerson(Person person)
		{
			this.person = person;
		}
		public String getSubject()
		{
			return subject;
		}
		public void setSubject(String subject)
		{
			this.subject = subject;
		}
		public MailFont getFont()
		{
			return font;
		}
		public void setFont(MailFont font)
		{
			this.font = font;
		}
	
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}