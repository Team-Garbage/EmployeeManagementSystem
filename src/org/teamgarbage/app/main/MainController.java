package org.teamgarbage.app.main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button button;

    @FXML
    private BorderPane bp;

    private Stage stage;

    @FXML
    public void initialize() {
        button.setOnAction(e -> {

        });
    }
}
