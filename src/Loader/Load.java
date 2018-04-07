/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Loader;

import Config.Config;
import Config.ImageLoad;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author emonh
 */
public class Load extends Application {
  
    
    public static String url="Login.fxml";
    public static String title="Login";
    public static Parent root;
    public static Stage stage;
    public static Scene scene;
    
    
    @Override
    public void start(Stage Pstage) throws Exception {
       stage=Pstage;
        if(Config.isConfigured()){
            root = FXMLLoader.load(getClass().getResource("/View/"+url));
            scene = new Scene(root);
            Config.setTitle(title);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.initStyle(StageStyle.UNDECORATED);
            if(title.equals("Login")){
                stage.getIcons().add(ImageLoad.img_dir("login.png"));
                stage.setMaximized(false);
            }else{
                stage.getIcons().add(ImageLoad.img_dir("sale_new.png"));
                stage.setMaximized(true);
            }
            stage.show();
        }else{
            root = FXMLLoader.load(getClass().getResource("/Install/install.fxml"));
            scene = new Scene(root);
            Config.setTitle("Install AmrCircle POS");
            stage.setScene(scene);
            stage.setResizable(false);          
            stage.show();
        }
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
