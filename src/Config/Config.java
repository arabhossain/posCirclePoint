/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Config;


import FileIO.FindFile;
import static Loader.Load.stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author emonh
 */
public class Config {
    
    
    
     public void addFXML(AnchorPane PaneName,String fileName){
      PaneName.getChildren().clear();
        try {
            PaneName.getChildren().add((Node) FXMLLoader.load(getClass().getResource("/Views/"+fileName+".fxml")));
        } catch (IOException ex) {
           Notify.exceptionMessage(ex);
        }
    }
     
    public static void setTitle(String title){
        stage.setTitle(title+" || "+AppVars.APP_VERSION);
    }
     public static boolean isConfigured(){
        boolean isConfigured=false;
        FindFile ff=new FindFile();
        if(ff.lookUpConfig()){
            if(Database.connect()!=null){
                isConfigured=true;
            }
        }else isConfigured=false;
        return isConfigured;
    }
    public static void app_exit(){
        if(Database.disconnect()==null){
            if(Utility.MySqlControlPanel.isApacheActive()){
                Utility.MySqlControlPanel.ApacheStop();
            }
            if(Utility.MySqlControlPanel.isMysqlActive()){
               // Utility.MySqlControlPanel.MySqlStop();
            }
            System.exit(0);
        }
    }
}
