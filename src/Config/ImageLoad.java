/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Config;

import javafx.scene.image.Image;

/**
 *
 * @author emonh
 */
public class ImageLoad {
        public static Image img_dir(String Image_Name) {
        return new Image("/images/" + Image_Name);
    }
}
