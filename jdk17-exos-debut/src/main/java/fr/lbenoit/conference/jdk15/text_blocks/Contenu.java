package fr.lbenoit.conference.jdk15.text_blocks;

public interface Contenu {
	String getContenu();

	default long length() {
		return getContenu().length();
	}
}
