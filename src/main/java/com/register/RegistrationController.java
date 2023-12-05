package com.register;

import com.SceneRouter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrationController {

    public Button registerButton;
    public Button backButton;
    public TextField emailField;
    public TextField usernameField;
    public TextField newUsernameField;
    SceneRouter sceneRouter = new SceneRouter();

    RegisterService registerService = new RegisterService();

    @FXML
    private PasswordField newPasswordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private void registerOnAction(ActionEvent event) {
        ///@TODO Check that passwords are mactching, check email, and check if the user doesn't already exist
        // Implement your registration logic here
        String email = emailField.getText();
        String username = usernameField.getText();
        String password = newPasswordField.getText();

        if(registerService.signUp(username,email,password))
        {
            System.out.println("Registration successful");
        }else
        {
            System.out.println("Registration failed");
        }

    }

    @FXML
    private void backOnAction(ActionEvent event) {
        // Switch back to login scene
        // For example:
        // ((Stage) backButton.getScene().getWindow()).setScene(loginScene);
        sceneRouter.changeScene(SceneRouter.Scene.LOGIN);
    }
}