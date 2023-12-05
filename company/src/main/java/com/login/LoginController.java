package com.login;

import com.SceneRouter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    SceneRouter sceneRouter = new SceneRouter();
    LoginService loginService = new LoginService();
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signIn;

    @FXML
    private Button signUp;

    @FXML
    private Button forgotPass;

    // Event handler for signIn button
    @FXML
    private void signInOnAction(ActionEvent event) {
        sceneRouter.changeScene(SceneRouter.Scene.MAIN);
        // Get username and password from text fields
/*        String username = usernameField.getText();
        String password = passwordField.getText();

        // Implement your sign-in logic here
        System.out.println("Sign In button pressed. Username: " + username + ", Password: " + password);

        if(loginService.signIn(username,password))
        {
            System.out.println("Login Success");
            sceneRouter.changeScene(SceneRouter.Scene.MAIN);
        }else
        {
            System.out.println("Login Failed, print alert");
        }*/

    }

    // Event handler for signUp button
    @FXML
    private void signUpOnAction(ActionEvent event) {
        // Implement your sign-up logic here

        System.out.println("Sign Up button pressed.");
        sceneRouter.changeScene(SceneRouter.Scene.REGISTER);
    }

    // Event handler for forgotPass button
    @FXML
    private void forgotPassOnAction(ActionEvent event) {
        // Implement your forgot password logic here
        System.out.println("Forgot Password button pressed.");
    }

    // Initialize method, if needed
    @FXML
    public void initialize() {
        // Initialization code here (if necessary)
    }
}
