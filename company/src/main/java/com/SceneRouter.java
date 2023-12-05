package com;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

import static com.CompanyApplication.gStage;

public class SceneRouter {
    public enum Scene {
        MAIN,
        LOGIN,
        REGISTER,
        RESET_PASS;
    }
    public static Scene currentScene;

    public void changeScene(Scene scene)
    {
        currentScene = scene;
        FXMLLoader loader;
        try {
            switch (scene) {
                case MAIN:
                    loader = new FXMLLoader(getClass().getResource("main.fxml"));
                    gStage.setTitle("Service Handler");
                    gStage.setScene(new javafx.scene.Scene(loader.load(), 963,746));
                    System.out.println("Go to main");
                    break;
                case LOGIN:
                    loader = new FXMLLoader(getClass().getResource("login.fxml"));
                    gStage.setTitle("Login");
                    gStage.setScene(new javafx.scene.Scene(loader.load(), 600, 346));
                    System.out.println("Go to login");
                    break;
                case REGISTER:
                    loader = new FXMLLoader(getClass().getResource("register.fxml"));
                    gStage.setTitle("Registration");
                    gStage.setScene(new javafx.scene.Scene(loader.load(), 600, 386));
                    System.out.println("Go to register");
                    break;
                case RESET_PASS:
                    loader = new FXMLLoader(getClass().getResource("reset_pass.fxml"));
                    gStage.setTitle("Reset Password");
                    gStage.setScene(new javafx.scene.Scene(loader.load(), 600, 346));
                    System.out.println("Go to reset pass");
                    break;
                default:
                    System.out.println("The task status is unknown.");
                    break;
            }
        }catch (IOException e) {
            e.printStackTrace();
            // Handle exception (e.g., FXML file not found)
        }
        gStage.show();

    }
}
