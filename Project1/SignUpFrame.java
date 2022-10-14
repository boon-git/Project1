package Project1;

import Project1.DataConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpFrame {
        @FXML
        private TextField signupTextFieldFullName;
        @FXML
        private TextField signupTextFieldPhone;
        @FXML
        private TextField signupTextFieldAddress;
        @FXML
        private TextField signupTextFieldUserName;
        @FXML
        private TextField signupTextFieldPassWord;
        @FXML
        private TextField signupTextFieldRePassWord;

    public void signupButtonOnAction(ActionEvent event){
        String fullName = signupTextFieldFullName.getText();
        String phone = signupTextFieldPhone.getText();
        String address = signupTextFieldAddress.getText();
        String userName = signupTextFieldUserName.getText();
        String passWord = signupTextFieldPassWord.getText();
        String rePassWord = signupTextFieldRePassWord.getText();
        Connection conn = null;
        PreparedStatement prepar = null;
        try {
            conn = new DataConnection().getConnection();
            conn.setAutoCommit(false);
            String sqlSignupInsert = "INSERT INTO signup(FullName, Phone, Address, UserName, PassWord) VALUE(?,?,?,?,?)";
            prepar = conn.prepareStatement(sqlSignupInsert);
            prepar.setString(1,fullName);
            prepar.setString(2,phone);
            prepar.setString(3,address);
            prepar.setString(4,userName);
            prepar.setString(5,passWord);
            prepar.executeUpdate();
            conn.commit();
        } catch (SQLException throwables) {
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }finally {
            try {
                if(conn != null) {
                    conn.close();
                }
                if(prepar != null){
                    prepar.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    public void cancelButtonOnAction(ActionEvent event){}
}
