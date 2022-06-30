package fr.lbenoit.conference.test.jdk17.sealed;

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

import java.util.List;

import org.junit.Test;

import fr.lbenoit.conference.jdk17.sealed.Moto;
import fr.lbenoit.conference.jdk17.sealed.Vehicule;
import fr.lbenoit.conference.jdk17.sealed.Voiture;
import fr.lbenoit.conference.jdk17.sealed.VoitureElectrique;
import fr.lbenoit.conference.jdk17.sealed.VoitureThermique;

public class TestAClasssesScellees {
	
	@Test
	public void test() {
		Vehicule vehicule = new Vehicule();
		Voiture megane = new Voiture();
		Moto suzuki = new Moto();
		
		VoitureElectrique zoe = new VoitureElectrique();
		VoitureThermique  micra = new VoitureThermique();
		
		List<Vehicule> vehicules = List.of(vehicule, megane, suzuki, zoe, micra);
		vehicules.forEach(v -> v.avancer());
	}

}
