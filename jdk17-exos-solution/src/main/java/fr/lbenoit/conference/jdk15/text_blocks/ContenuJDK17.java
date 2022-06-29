package fr.lbenoit.conference.jdk15.text_blocks;

public class ContenuJDK17 implements Contenu {
	
	private String CONTENU_JDK17 = """
									<html>
									<head>
										<title>Mon contenu</title>
									</head>
									<body>
										<h1>Bonjour Montpellier</h1>
										<h2>Comment ca va ?</h2>
									</body>
									</html>
						""";

	public String getContenu() {
		return CONTENU_JDK17;
	}
}
