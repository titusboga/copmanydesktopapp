package com.company.company;

import company.Hello.LoginRequest;
import company.Hello.LoginResponse;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;
import test.AuthClient;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public GrpcClient grpcClient = new GrpcClient();

    private final MainService mainService = new MainService();
    public ToggleButton mariadbButton1;
    public ToggleButton mysqlButton1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
     //   updateElements();
    }

  /*  private void updateElements()
    {
        mariadbButton.setText(mainService.getButtonText(mariadbButton.isSelected()));
        mysqlButton.setText(mainService.getButtonText(mysqlButton.isSelected()));
    }
    public void mariadbButtonIDOnAction(ActionEvent actionEvent)
    {
        if(mariadbButton.isSelected())
        {
            grpcClient.run("up");
        }
        else
        {
            grpcClient.run("down");
        }
        updateElements();
    }*/

    public void mysqlButtonIDOnAction(ActionEvent actionEvent) throws IOException {
        AuthClient authClient = new AuthClient();
        // Create a LoginRequest object with email and password
        LoginRequest loginRequest = LoginRequest.newBuilder()
                .setEmail("user@example.com")  // Assuming this is the correct field name in your .proto
                .setPassword("password123")
                .build();

        // Call sendLoginRequest and handle the LoginResponse
        try {
            LoginResponse loginResponse = authClient.sendLoginRequest(loginRequest);
            if (loginResponse != null) {
                // Check the status of the response
                if (loginResponse.getStatus() == LoginResponse.Status.SUCCESS) {
                    System.out.println("Login successful: " + loginResponse.getMessage());
                } else {
                    System.out.println("Login failed: " + loginResponse.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while sending the login request.");
        }
      //  updateElements();

    }


    public void mariadbButtonIDOnAction1(ActionEvent actionEvent) {
    }

    public void mysqlButtonIDOnAction1(ActionEvent actionEvent) {
    }
}