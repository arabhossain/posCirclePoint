/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package FileIO;

import Config.AppVars;
import Config.Notify;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author emonh
 */
public class FindFile {
    public boolean lookUpConfig(){
        try{
            File fXmlFile = new File("./Configs/Localconfig.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();
		
            NodeList nList = doc.getElementsByTagName("Driver");

            for (int temp = 0; temp < nList.getLength(); temp++) {
		Node nNode = nList.item(temp);		
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			Element eElement = (Element) nNode;

			AppVars.setDRIVER_Type(eElement.getAttribute("Connection"));
                        AppVars.setJDBC_DRIVER(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("xamppRoot").item(0).getTextContent()));
			AppVars.setJDBC_DRIVER(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("JDBC_DRIVER").item(0).getTextContent()));
			AppVars.setDB_Url(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("DB_URL").item(0).getTextContent()));
			AppVars.setDbName(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("DB_Name").item(0).getTextContent()));
			AppVars.setDbUser(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("DB_User").item(0).getTextContent()));
                        AppVars.setDbPass(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("DB_Password").item(0).getTextContent()));
		}
            }
            return true;
        }catch(Exception e){
            Notify.exceptionMessage(e);
            return false;
        }
    }
}
