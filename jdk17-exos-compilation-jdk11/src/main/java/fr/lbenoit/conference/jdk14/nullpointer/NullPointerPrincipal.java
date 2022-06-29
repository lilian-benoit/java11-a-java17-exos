package fr.lbenoit.conference.jdk14.nullpointer;

import java.util.HashMap;

public class NullPointerPrincipal {

	public static void main(String[] args) {
		HashMap<String, String> attributs = initialiseMapAttributs();
		
		int nb = attributs.get("mon-attribut").length();
		
		System.out.println("Nb de caractère de mon attribut : " + nb);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static HashMap<String, String> initialiseMapAttributs() {
		HashMap<String, String> map = null;
//		map = new HashMap<>();
//		map.put("mon-attribut", "ma-valeur");
		return map;
	}

}
