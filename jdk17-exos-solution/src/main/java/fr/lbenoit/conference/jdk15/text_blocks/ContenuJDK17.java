package fr.lbenoit.conference.jdk15.text_blocks;

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
