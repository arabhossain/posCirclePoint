/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Utility;

import Config.Notify;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author emonh
 */
public class Validations {
    private static String FormValidationTitle;
    public static boolean validate_textField(JFXTextField text){
        if(text.getText().equals("") || text.getText() == null){
            Notify.error(FormValidationTitle, text.getPromptText());
            return false;            
        }else{
            try{
                Integer.parseInt(text.getText());
                Notify.error(FormValidationTitle, text.getId()+" should not have numerical value");
                return false;
            }catch(NumberFormatException ex){
                return true;
            }
        }
    }
    
    public static boolean validate_NumberField(JFXTextField text){
        if(text.getText().equals("") || text.getText() == null){
            Notify.error(FormValidationTitle, text.getPromptText());
            return false;
        }else{
            try{
                Integer.parseInt(text.getText());
                return true;
            }catch(NumberFormatException ex){
                 Notify.error(FormValidationTitle, text.getId()+" should not have string value");
                return true;
            }
        }
    }
    
    public static void RequiredTextValidaion(JFXTextField a,String msg){
         RequiredFieldValidator validator=new RequiredFieldValidator();
        a.getValidators().add(validator);
        validator.setMessage(msg);
        a.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if(!newValue){
                a.validate();
            }
         });
    }

    /**
     *
     * @param a
     * @param msg
     */
    public static void RequiredPasswordValidaion(JFXPasswordField a,String msg){
         RequiredFieldValidator validator=new RequiredFieldValidator();
        a.getValidators().add(validator);
        validator.setMessage(msg);
        a.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
            if(!newValue){
                a.validate();
            }
         });
    }
}
