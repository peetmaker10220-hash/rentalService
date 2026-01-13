package th.co.scb.ngage.repository.externalAPI;

import org.springframework.stereotype.Repository;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

@Repository
public class ExternalApiRepository {
    public Object callExternalApi() {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/1";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            return "API call failed: " + e.getMessage();
        }
    }
}
