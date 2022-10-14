package Project1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class interfaceHotel3 implements Initializable {
    @FXML
    private ImageView interfaceHotel3ImageKitchen;

    @FXML
    private ImageView interfaceHotel3ImageParking;

    @FXML
    private ImageView interfaceHotel3ImageBacolny;

    @FXML
    private ImageView interfaceHotel3ImageHairdryer;

    @FXML
    private ImageView interfaceHotel3ImageWifi;

    @FXML
    private ImageView interfaceHotel3ImageTV;

    @FXML
    private ImageView interfaceHotel3ImageLuggageStorage;

    @FXML
    private ImageView interfaceHotel3ImageCamera;

    @FXML
    private Label interfaceHotel3LabelPricePerNight;

    @FXML
    private Button interfaceHotel3ButtonBookRoom;

    @FXML
    private Label interfaceHotel3LabelDateCheckin;

    @FXML
    private Label interfaceHotel3LabelDateCheckout;

    @FXML
    private Label interfaceHotel3LabelNumberPerson;

    @FXML
    private Label interfaceHotel3LabelPriceTotalNights;

    @FXML
    private Label interfaceHotel3Label$TotalNights;

    @FXML
    private Label interfaceHotel3Label$Total;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File kitchenImageFile = new File("ProjectFrame1/interfaceHotel3/kitchen.png");
        Image kitchenImage = new Image(kitchenImageFile.toURI().toString());
        interfaceHotel3ImageKitchen.setImage(kitchenImage);

        File parkingImageFile = new File("ProjectFrame1/interfaceHotel3/parking.png");
        Image parkingImage = new Image(parkingImageFile.toURI().toString());
        interfaceHotel3ImageParking.setImage(parkingImage);

        File bacolnyImageFile = new File("ProjectFrame1/interfaceHotel3/house.png");
        Image bacolnyImage = new Image(bacolnyImageFile.toURI().toString());
        interfaceHotel3ImageBacolny.setImage(bacolnyImage);

        File hairdryerImageFile = new File("ProjectFrame1/interfaceHotel3/hairdryer.png");
        Image hairdryerImage = new Image(hairdryerImageFile.toURI().toString());
        interfaceHotel3ImageHairdryer.setImage(hairdryerImage);

        File wifiImageFile = new File("ProjectFrame1/interfaceHotel3/wifi.png");
        Image wifiImage = new Image(wifiImageFile.toURI().toString());
        interfaceHotel3ImageWifi.setImage(wifiImage);

        File TVImageFile = new File("ProjectFrame1/interfaceHotel3/TV.png");
        Image TVImage = new Image(TVImageFile.toURI().toString());
        interfaceHotel3ImageTV.setImage(TVImage);

        File luggageStorageImageFile = new File("ProjectFrame1/interfaceHotel3/luggage.png");
        Image luggageStorageImage = new Image(luggageStorageImageFile.toURI().toString());
        interfaceHotel3ImageLuggageStorage.setImage(luggageStorageImage);

        File cameraImageFile = new File("ProjectFrame1/interfaceHotel3/camera.png");
        Image cameraImage = new Image(cameraImageFile.toURI().toString());
        interfaceHotel3ImageCamera.setImage(cameraImage);

    }

    public void bookRoomButtonOnAction(ActionEvent event){

    }
}
