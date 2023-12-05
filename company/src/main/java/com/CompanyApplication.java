package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class CompanyApplication extends Application {
    public static Stage gStage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CompanyApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 346);
        gStage =stage;
        gStage.setTitle("Company v1.0.0");
        gStage.setScene(scene);
        gStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}