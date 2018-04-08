/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Install;

import Config.AppVars;
import Config.Database;
import Config.Notify;
import Config.ThisPC;
import FileIO.FindFile;
import Utility.Validations;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class InstallController implements Initializable {
    @FXML
    private JFXTextField txt_xammRoot;
    @FXML
    private JFXTextField txt_LHost;

 

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
         setValues();
         FindFile ff=new FindFile();
         if(ff.editLocalXML()){
             ff.lookUpConfig();
             Notify.success("Configured Successfully", "Local Database Configuration Updated");
             if(testConnection()){
                 Notify.information("Notification", "will do start from here from the next day :D ");
             }
         }else Notify.error("Error", "Error Updating XML Configured File");
    }

    @FXML
    void btn_test(ActionEvent event) {
      testConnection();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        readValues();
    }
    private boolean testConnection(){
         if(Database.connect()==null){
           Notify.error("Error", "Database Can't connect");
           return false;
       }else{
           Notify.success("Success", "Connection stablished");
           return true;
       }
    }
    private void setValues(){
       Validations.validate_textField(this.txt_xammRoot);
       Validations.validate_textField(this.txt_LHost);
       Validations.validate_textField(this.txt_LDtabase);
       Validations.validate_textField(this.txt_LUsers);
      

       AppVars.XmappRootFolderURL=this.txt_xammRoot.getText();
       AppVars.setDB_Url(this.txt_LHost.getText());
       AppVars.setDbName(this.txt_LDtabase.getText());
       AppVars.setDbUser(this.txt_LUsers.getText());
       AppVars.setDbPass(this.txt_LPassword.getText());
    }
    private void readValues(){
        
        this.txt_xammRoot.setText(AppVars.XmappRootFolderURL);
        this.txt_LHost.setText(AppVars.getDB_Url());
        this.txt_LDtabase.setText(AppVars.getDbName());
        this.txt_LUsers.setText(AppVars.getDbUser());
        this.txt_LPassword.setText(AppVars.getDbPass());
        
        this.txt_CHost.setText(AppVars.getCloudIP());
        this.txt_CPort.setText(AppVars.getCloudPort());
        this.txt_CDtabase.setText(AppVars.getCloudDatabaseName());
        this.txt_CUsers.setText(AppVars.getCloudUser());
        this.txt_CPassword.setText(AppVars.getCloudPass());
        
        this.txt_ip.setText(ThisPC.getIP());
    }

}

