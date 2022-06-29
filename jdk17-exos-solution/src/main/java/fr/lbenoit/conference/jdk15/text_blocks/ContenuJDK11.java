package fr.lbenoit.conference.jdk15.text_blocks;

public class ContenuJDK11 implements Contenu {
	
	private String CONTENU_JDK11 = "<html>\n"
			+ "<head>\n"
			+ "<title>Mon contenu</title>\n"
			+ "</head>\n"
			+ "<body>\n"
			+ "<h1>Bonjour Montpellier</h1>\n"
			+ "<h2>Comment ca va ?</h2>\n"
			+ "</body>\n"
			+ "</html>";
	
	public String getContenu( ) {
		return CONTENU_JDK11;
	}
}
