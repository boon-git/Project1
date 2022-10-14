package Project1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class interfaceHotel2 implements Initializable {
    @FXML
    private ImageView interfaceHotel2Image1;
    @FXML
    private Label interfaceHotel2Name1;
    @FXML
    private Label interfaceHotel2Price1;

    @FXML
    private ImageView interfaceHotel2Image2;
    @FXML
    private Label interfaceHotel2Name2;
    @FXML
    private Label interfaceHotel2Price2;

    @FXML
    private ImageView interfaceHotel2Image3;
    @FXML
    private Label interfaceHotel2Name3;
    @FXML
    private Label interfaceHotel2Price3;

    @FXML
    private ImageView interfaceHotel2Image4;
    @FXML
    private Label interfaceHotel2Name4;
    @FXML
    private Label interfaceHotel2Price4;

    @FXML
    private ImageView interfaceHotel2Image5;
    @FXML
    private Label interfaceHotel2Name5;
    @FXML
    private Label interfaceHotel2Price5;

    @FXML
    private ImageView interfaceHotel2Image6;
    @FXML
    private Label interfaceHotel2Name6;
    @FXML
    private Label interfaceHotel2Price6;

    @FXML
    private ImageView interfaceHotel2Image7;
    @FXML
    private Label interfaceHotel2Name7;
    @FXML
    private Label interfaceHotel2Price7;

    @FXML
    private ImageView interfaceHotel2Image8;
    @FXML
    private Label interfaceHotel2Name8;
    @FXML
    private Label interfaceHotel2Price8;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File image1File = new File("ProjectFrame1/interfaceHotel2/maybya.jpg");
        Image image1 = new Image(image1File.toURI().toString());
        interfaceHotel2Image1.setImage(image1);
    }
}
