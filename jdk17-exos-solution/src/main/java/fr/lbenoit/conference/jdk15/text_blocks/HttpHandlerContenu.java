package fr.lbenoit.conference.jdk15.text_blocks;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class HttpHandlerContenu implements HttpHandler {
	private Contenu contenu;
	
	public HttpHandlerContenu(Contenu c) {
		this.contenu = c;
	}

	@Override
	public void handle(HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200, this.contenu.length());
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(this.contenu.getContenu().getBytes());
        }
	}
	
}
