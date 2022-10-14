package Project1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class interfaceHotel1 implements Initializable {
    @FXML
    private ComboBox interfaceHotel1ComboBoxDestination;
    @FXML
    private ComboBox interfaceHotel1ComboBoxDuration;
    @FXML
    private ComboBox interfaceHotel1ComboBoxGuest;
    @FXML
    private ComboBox interfaceHotel1ComboBoxRoom;
    @FXML
    private DatePicker interfaceHotel1DatePickerCheckIn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> destinationList = FXCollections.observableArrayList("Nha Trang","Da Nang","Hue","Ha Noi");
        interfaceHotel1ComboBoxDestination.setItems(destinationList);

        ObservableList<String> durationList = FXCollections.observableArrayList("1 Night","2 Nights","3 Nights","4 Nights","5 Nights","6-10 Nights");
        interfaceHotel1ComboBoxDuration.setItems(durationList);

        ObservableList<String> guestList = FXCollections.observableArrayList("1 Person","2 Persons","3 Persons","4 Persons","5 Persons","6-10 Persons");
        interfaceHotel1ComboBoxGuest.setItems(guestList);

        ObservableList<String> roomList = FXCollections.observableArrayList("1 Room","2 Room","3 Room","4 Room","5 Room","6 Room");
        interfaceHotel1ComboBoxRoom.setItems(roomList);

    }
    public void datePickerCheckInOnAction(ActionEvent event){
        LocalDate date = interfaceHotel1DatePickerCheckIn.getValue();
        System.out.println(date.toString());
    }
}
