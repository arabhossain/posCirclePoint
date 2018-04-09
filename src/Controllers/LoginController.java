/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Controllers;

import Config.AppVars;
import Utility.Validations;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author emonh
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.lbl_company.setText(AppVars.getShopName());
        Validations.RequiredTextValidaion(txt_username, "Username is a required field");
        Validations.RequiredPasswordValidaion(this.txt_password, "Passowrd is a required field");
    }    
    
     @FXML
    private Label lbl_company;

    @FXML
    private JFXTextField txt_username;

    @FXML
    private JFXPasswordField txt_password;

    @FXML
    void btn_cancel(ActionEvent event) {
       Config.Config.app_exit();
    }

    @FXML
    void btn_login(ActionEvent event) {
        
    }
}
