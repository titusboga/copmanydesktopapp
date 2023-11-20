package com.company.company;

import company.Hello;
import test.AuthClient;

import java.io.IOException;

public class RegisterService {
    AuthClient authClient = new AuthClient();

    public boolean signUp(String username, String email, String password) {

        // Create a RegisterRequest protobuf message
        Hello.RegisterRequest registerRequest = Hello.RegisterRequest.newBuilder()
                .setEmail(email)
                .setUsername(username)
                .setPassword(password)
                .build();

        // Send the register request and handle the response
        try {
            Hello.RegisterResponse registerResponse = authClient.sendRegisterRequest(registerRequest);
            if (registerResponse != null && registerResponse.getStatus() == Hello.RegisterResponse.Status.SUCCESS) {
                System.out.println("Registration successful: " + registerResponse.getMessage());
                return true;
                // Code to switch to the login screen or other appropriate action
            } else if (registerResponse != null) {
                // The registration failed
                System.out.println("Registration failed: " + registerResponse.getMessage());
                return false;
            }
        } catch (IOException e) {
            System.out.println("Error sending registration request.");
            e.printStackTrace();
        }
        return false;
    }
}

