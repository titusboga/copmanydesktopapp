package test;

import company.Hello;
import company.Hello.LoginRequest;
import company.Hello.LoginResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class AuthClient {

    private final HttpClient httpClient = HttpClients.createDefault();
    private final String loginServiceUrl = "http://localhost:8080/users";

    public LoginResponse sendLoginRequest(LoginRequest loginRequest) throws IOException {
        // Serialize the protobuf LoginRequest message to a byte array
        byte[] loginRequestBytes = loginRequest.toByteArray();

        // Create an HttpPost instance with the target URL
        HttpPost postRequest = new HttpPost(loginServiceUrl);
        // Set the appropriate header to indicate the content type
        postRequest.setHeader("Content-Type", "application/x-protobuf");
        // Attach the serialized LoginRequest byte array to the request
        postRequest.setEntity(new ByteArrayEntity(loginRequestBytes));

        // Execute the request
        HttpResponse response = httpClient.execute(postRequest);

        // Handle the response
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode == 200) {
            // Deserialize the protobuf LoginResponse message from the response byte array
            byte[] responseBytes = EntityUtils.toByteArray(response.getEntity());
            return LoginResponse.parseFrom(responseBytes);
        } else {
            System.out.println("Failed to send login request. Status code: " + statusCode);
            // Handle error as appropriate for your application
            // For the purpose of this example, we'll just return null
            return null;
        }
    }
}

