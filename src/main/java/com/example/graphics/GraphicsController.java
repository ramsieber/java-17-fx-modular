package com.example.graphics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class GraphicsController implements Initializable{
    Rectangular rect = new Rectangular(0.0,0.0,0.0,0.0);

    private boolean widthCorrect = false;
    private boolean heightCorrect = false;

    @FXML
    public TextField widthField;
    @FXML
    public TextField heightField;
    @FXML
    public Text resultCircumference;
    @FXML
    public Text resultArea;
    @FXML
    public Button computeButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initResultField();
    }

    @FXML
    public void handleComputeButton(ActionEvent actionEvent) {
        resultArea.setText(String.valueOf(rect.computeArea(Double.parseDouble(widthField.getText()), Double.parseDouble(heightField.getText()))));
        resultCircumference.setText(String.valueOf(rect.computeCircumference(Double.parseDouble(widthField.getText()), Double.parseDouble(heightField.getText()))));
    }


    private void initResultField() {
    }


}
