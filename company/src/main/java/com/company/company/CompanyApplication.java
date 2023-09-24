package com.company.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CompanyApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CompanyApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 1024);
        stage.setTitle("Company v1.0.0");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
       // launch();
    }

}