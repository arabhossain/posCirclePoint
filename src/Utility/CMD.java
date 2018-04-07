/*
    Software Engineer
    ---------------------------------------
    Md. Arab Hossain
    Email: arabhossain317@diu.edu.bd
           green.arab1995@gmail.com
    Mobile: +8801827-464330
            +8801737-331037
    Daffodil International University(Student)
 */
package Utility;

import Config.Notify;

/**
 *
 * @author Loser
 */
public class CMD {
    private static Runtime cmd;
    private static Process exe;
    
    /**
     *
     * @param ExecutableCode
     * @param Message
     * @return
     */
    public static boolean runAsCMD(String ExecutableCode, String Message){
        cmd=Runtime.getRuntime();
        try {
            exe=cmd.exec(ExecutableCode);
            Notify.console(Message);
            return exe.isAlive();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
