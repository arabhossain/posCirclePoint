/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Config;

import static Loader.Load.stage;
import javafx.stage.FileChooser;

/**
 *
 * @author emonh
 */
public class Chooser {

    /**
     *
     * @param Image_Chooser_Title
     * @return
     */
    public static String getImageFile(String Image_Chooser_Title){
        FileChooser f=new FileChooser();
        f.setTitle(Image_Chooser_Title);
        FileChooser.ExtensionFilter imgFilter = new FileChooser.ExtensionFilter("Image files", "*.jpg","*.png");
        f.getExtensionFilters().add(imgFilter);

        return f.showOpenDialog(stage).getAbsolutePath();
    }

    /**
     *
     * @param Title
     * @return
     */
    public static String getSqlFile(String Title){
        FileChooser f=new FileChooser();
        f.setTitle(Title);
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Database File", "*.sql");
        f.getExtensionFilters().add(extFilter);
        return f.showOpenDialog(stage).getAbsolutePath();
    }

    /**
     *
     * @param input
     * @return
     */
    public static String toSimpleURL(String input){
        return input.replace('\\', '/');
    }
}