package Project1;

import Project1.Loader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class PZZ implements Initializable {
    @FXML
    private BorderPane userTestPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void testButtonOnAction(ActionEvent event){
        Loader loadFXML = new Loader();
        Pane view = loadFXML.getPane("SignUp");
        userTestPane.setCenter(view);
    }
}
