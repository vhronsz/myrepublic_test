import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//
public class Main {
    public static void main(String[] args) {
        String urlString = "https://api.example.com/data"; // Replace with your JSON URL
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlString))
                    .header("Accept", "application/json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JSONObject json = new JSONObject(response.body());
                String name = json.getString("name");
                String website = json.getString("website");
                String email = json.getString("email");
                String phone = json.getString("phone");

                //Check first if success
                System.out.println("JSON Response: " + json.toString(4)); // Pretty print JSON
            } else {
                System.out.println("HTTP error code: " + response.statusCode());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
