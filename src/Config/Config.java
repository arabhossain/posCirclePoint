/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Config;


import static Loader.Load.stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

/**
 *
 * @author emonh
 */
public class Config {
    
     public void addFXML(AnchorPane PaneName,String fileName){
      PaneName.getChildren().clear();
        try {
            PaneName.getChildren().add((Node) FXMLLoader.load(getClass().getResource("/View/"+fileName+".fxml")));
        } catch (IOException ex) {
            ex.printStackTrace();
           // Notify.toConsole(fileName+ ".fxml file can't be loaded!");
           // Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
        public static void setTitle(String title){
         stage.setTitle(title+" || "+AppVars.APP_VERSION);
        }
    
}
