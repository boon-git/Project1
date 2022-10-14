package Project1;

import Project1.Loader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class UserInterface implements Initializable {
    @FXML
    private ImageView userInterfaceView;
    @FXML
    private AnchorPane userInterfaceAnchorPane;
    @FXML
    private BorderPane userInterfaceBorderPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File userInterfaceImageFile = new File("ProjectFrame1/UserInterface/Viewhotel.jpg");
        Image UserInterfaceImage = new Image(userInterfaceImageFile.toURI().toString());
        userInterfaceView.setImage(UserInterfaceImage);
    }

    public void loginButtonOnAction(ActionEvent event){
        Loader loadFXML = new Loader();
        Pane view = loadFXML.getPane("loginFrame");
        userInterfaceBorderPane.setCenter(view);
    }

    public void signupButtonOnAction(ActionEvent event){
        Loader loadFXML = new Loader();
        Pane view = loadFXML.getPane("SignUp");
        userInterfaceBorderPane.setCenter(view);
    }
    public void hotelButtonOnAction(ActionEvent event){
        Loader loadFXML = new Loader();
        Pane view = loadFXML.getPane("interfaceHotel1");
        userInterfaceBorderPane.setCenter(view);
    }
    public void planeButtonOnAction(ActionEvent event){

    }
    public void taxiButtonOnAction(ActionEvent event){

    }

}
