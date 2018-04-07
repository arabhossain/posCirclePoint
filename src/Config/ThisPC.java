/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Config;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author emonh
 */
public class ThisPC {
    public static String getIP(){
        InetAddress ipAddress = null;
		try{
			ipAddress=InetAddress.getLocalHost();
		}catch (UnknownHostException exception){
			exception.printStackTrace();
		}
        return ipAddress.getHostAddress();
    }
}
