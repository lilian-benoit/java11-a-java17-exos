package fr.lbenoit.conference.jdk14.switch_expressions;

public class JourUtils {
	public static int nbCaractere(Jour param) {
		int nb = 0;
		switch (param) {
		case LUNDI:
		case MARDI:
		case JEUDI:
			int tmp = 5;
			nb = tmp;
			break;
		case MERCREDI:
		case VENDREDI:
		case DIMANCHE:
			nb = 8;
			break;
		case SAMEDI:
			nb = 6;
			break;
		default:
	        throw new IllegalStateException("hein ?!: " + param);
		}
		return nb;
	}
}
