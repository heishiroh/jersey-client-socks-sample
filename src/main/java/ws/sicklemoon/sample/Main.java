package ws.sicklemoon.sample;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;

public class Main {

	public static void main(String[] args) {
		SocksConnectionFactory connectionFactory = new SocksConnectionFactory("localhost", 18080);
		HttpUrlConnectorProvider connectorProvider = new HttpUrlConnectorProvider();
		connectorProvider.connectionFactory(connectionFactory);
		Configuration configuration = new ClientConfig().connectorProvider(connectorProvider);
		Client client = ClientBuilder.newClient(configuration);

		WebTarget target = client.target("http://www.google.com/");
		String entity = target.request().get().readEntity(String.class);

		System.err.println("GET: " + entity);
	}
}
