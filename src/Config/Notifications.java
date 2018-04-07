/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Config;

import javafx.scene.image.Image;
import javafx.scene.paint.Paint;
import javafx.util.Duration;
import javax.management.Notification;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 *
 * @author emonh
 */
public class Notifications extends NType{
    public static void success(String title,String message){
       NotificationType nt=NotificationType.SUCCESS;
       TryNotifications(title,message,nt);
    }
    public static void error(String title,String message){
       NotificationType nt=NotificationType.ERROR;
       TryNotifications(title,message,nt);
    }
    public static void information(String title,String message){
       NotificationType nt=NotificationType.INFORMATION;
       TryNotifications(title,message,nt);
    }
    public static void notice(String title,String message){
       NotificationType nt=NotificationType.NOTICE;
       TryNotifications(title,message,nt);
    }
    public static void warning(String title,String message){
       NotificationType nt=NotificationType.WARNING;
       TryNotifications(title,message,nt);
    }
    public static void withAppLogo(String title,String message){
       withlogo(title,message);
    }
}

class NType{
    protected static void TryNotifications(String title, String message, NotificationType nt){
      // Image appLogo = new Image("https://cdn4.iconfinder.com/data/icons/iconsimple-logotypes/512/whatsapp-128.png");
       NotificationType notification = nt;
       TrayNotification tray = new TrayNotification();
       tray.setTitle(title);
       tray.setMessage(message);
       tray.setRectangleFill(Paint.valueOf("#2A9A84"));
       tray.setAnimationType(AnimationType.FADE);
       tray.setNotificationType(notification);
       //tray.setImage(appLogo);
       tray.showAndDismiss(Duration.seconds(5));
    }
     protected static void withlogo(String title, String message){
       Image appLogo = ImageLoad.img_dir("app");
  
       TrayNotification tray = new TrayNotification();
       tray.setTitle(title);
       tray.setMessage(message);
       tray.setRectangleFill(Paint.valueOf("#2A9A84"));
       tray.setAnimationType(AnimationType.FADE);
       tray.setImage(appLogo);
       tray.showAndDismiss(Duration.seconds(5));
    }    
}