/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package FileIO;

import Config.AppVars;
import java.io.File;

/**
 *
 * @author emonh
 */
public class Delete {
        /**
     *
     * @param File_Name
     */
    public Delete(String File_Name){
       try{
        File file = new File(AppVars.getDIR_URL()+File_Name);
        file.delete();
       }catch(Exception e){
           
       }
   } 

    /**
     *
     * @param File_URL
     * @param Null
     * @param Nulle
     */
    public Delete(String File_URL, String Null,String Nulle){
      try{
       File file = new File(File_URL);
       file.delete();
        }catch(Exception e){
           
       }
   }

    /**
     *
     * @param File_Name
     * @param File_URL
     */
    public Delete(String File_Name, String File_URL){
      try{
       File file = new File(File_URL+File_Name);
       file.delete();
        }catch(Exception e){
           
       }
   }
}
