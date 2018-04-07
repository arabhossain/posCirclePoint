/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Config;

import java.io.PrintWriter;
import java.io.StringWriter;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import org.controlsfx.control.Notifications;


/**
 *
 * @author emonh
 */
public class Notify{
    public static void success(String title,String message){
       Notifications.create()
               .title(title)
               .text(message)
               .darkStyle()
               .show();
    }
    public static void error(String title,String message){
       Notifications.create()
               .title(title)
               .text(message)
               .darkStyle()
               .showError();
    }
    public static void information(String title,String message){
       Notifications.create()
               .title(title)
               .text(message)
               .darkStyle()
               .showInformation();
    }
    public static void warning(String title,String message){
       Notifications.create()
               .title(title)
               .text(message)
               .darkStyle()
               .showWarning();
    }
    public static void console(String message){
        System.out.println(message);
    }
    public static void exceptionMessage(Exception ex){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Exception Dialog");
        alert.setHeaderText("Look, an Exception Dialog");
        alert.setContentText(ex.getMessage());
        
        Label label = new Label("The exception stacktrace was:");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        String exceptionText = sw.toString();
        TextArea textArea = new TextArea(exceptionText);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea, Priority.ALWAYS);

        GridPane expContent = new GridPane();
        expContent.setMaxWidth(Double.MAX_VALUE);
        expContent.add(label, 0, 0);
        expContent.add(textArea, 0, 1);

        // Set expandable Exception into the dialog pane.
        alert.getDialogPane().setExpandableContent(expContent);

        alert.showAndWait();
    }
}
