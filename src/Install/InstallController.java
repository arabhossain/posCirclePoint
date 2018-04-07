/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Install;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.paint.Paint;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.TrayNotification;

public class InstallController {

    @FXML
    private JFXTextField txt_LHost;

    @FXML
    private JFXTextField txt_LPort;

    @FXML
    private JFXTextField txt_LDtabase;

    @FXML
    private JFXTextField txt_LUsers;

    @FXML
    private JFXTextField txt_LPassword;

    @FXML
    private JFXTextArea txt_license;

    @FXML
    private JFXTextField txt_CHost;

    @FXML
    private JFXTextField txt_CPort;

    @FXML
    private JFXTextField txt_CDtabase;

    @FXML
    private JFXTextField txt_CUsers;

    @FXML
    private JFXTextField txt_CPassword;

    @FXML
    private JFXTextField txt_ip;

    @FXML
    void btn_next(ActionEvent event) {
        Image whatsAppImg = new Image("https://cdn4.iconfinder.com/data/icons/iconsimple-logotypes/512/whatsapp-128.png");

        TrayNotification tray = new TrayNotification();
        tray.setTitle("New WhatsApp Message");
        tray.setMessage("Github - I like your new notification release. Nice one.");
        tray.setRectangleFill(Paint.valueOf("#2A9A84"));
        tray.setAnimationType(AnimationType.FADE);
        tray.setImage(whatsAppImg);
        tray.showAndDismiss(Duration.seconds(5));
    }

    @FXML
    void btn_test(ActionEvent event) {

    }

}

