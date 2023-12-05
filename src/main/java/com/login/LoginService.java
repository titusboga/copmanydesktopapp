package com.login;

import company.Hello;
import test.AuthClient;

import java.io.IOException;

public class LoginService {
    AuthClient authClient = new AuthClient();

    public boolean signIn(String username, String password)
    {
        Hello.LoginRequest loginRequest = Hello.LoginRequest.newBuilder()
                .setUsername(username)  // Assuming this is the correct field name in your .proto
                .setPassword(password)
                .build();

        // Call sendLoginRequest and handle the LoginResponse
        try {
            Hello.LoginResponse loginResponse = authClient.sendLoginRequest(loginRequest);
            if (loginResponse != null) {
                // Check the status of the response
                if (loginResponse.getStatus() == Hello.LoginResponse.Status.SUCCESS) {
                    System.out.println("Login successful: " + loginResponse.getMessage());
                    return true;
                } else {
                    System.out.println("Login failed: " + loginResponse.getMessage());
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while sending the login request.");
        }
        return false;
    }
}
