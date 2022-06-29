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

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class TextBlockPrincipal {

	public static void main(String[] args) throws IOException {
		HttpServer httpd = HttpServer.create(new InetSocketAddress(8080),0);
		httpd.setExecutor(null);
		
		HttpHandler handlerJDK11 = new HttpHandlerContenu(new ContenuJDK11());
		HttpHandler handlerJDK17 = new HttpHandlerContenu(new ContenuJDK17());

		httpd.createContext("/jdk11", handlerJDK11);
		httpd.createContext("/jdk17", handlerJDK17);

		httpd.start();
		System.out.println("Serveur démarré : " + httpd.getAddress());
	}
	
}
