package fr.lbenoit.conference.jdk14.nullpointer;

/*-
 * #%L
 * java11-a-java17-exos
 * %%
 * Copyright (C) 2022 Lilian BENOIT
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

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
