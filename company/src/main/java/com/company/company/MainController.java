package com.company.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public ToggleButton mariadbButton;
    public ToggleButton mysqlButton;

    public GrpcClient grpcClient = new GrpcClient();

    private final MainService mainService = new MainService();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        updateElements();
    }

    private void updateElements()
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
    }

    public void mysqlButtonIDOnAction(ActionEvent actionEvent) {
        updateElements();
    }


}