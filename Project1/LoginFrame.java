package Project1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginFrame implements Initializable {

    @FXML
    private ImageView userImageView;
    @FXML
    private ImageView passwordImageView;
    @FXML
    private TextField userTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private Label messageLabel;
    @FXML
    private Button cancelButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File userImageFile = new File("ProjectFrame1/loginFrame/LoginUser.png");
        Image userImage = new Image(userImageFile.toURI().toString());
        userImageView.setImage(userImage);

        File passwordImageFile = new File("ProjectFrame1/LoginFrame/LoginPassword.png");
        Image passwordImage = new Image(passwordImageFile.toURI().toString());
        passwordImageView.setImage(passwordImage);

    }

    public void loginButtonOnAction(ActionEvent event){
        if(userTextField.getText().isBlank() == false && passwordTextField.getText().isBlank() == false){
            messageLabel.setText("You try to login");
            System.out.println("User: "+userTextField.getText());
            System.out.println("Pass: "+passwordTextField.getText());
        }else {
            messageLabel.setText("Please enter Username and Password");
        }
    }

    public void cancelButtonOnAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
