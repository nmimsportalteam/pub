import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class OpenApiFetcher {
    
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/1";
        Response response = client.target(apiUrl).request(MediaType.APPLICATION_JSON).get();
        String jsonResponse = response.readEntity(String.class);
        System.out.println(jsonResponse);
        client.close();
    }
    
}