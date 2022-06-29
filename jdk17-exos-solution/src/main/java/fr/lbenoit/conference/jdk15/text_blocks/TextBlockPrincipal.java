package fr.lbenoit.conference.jdk15.text_blocks;

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
