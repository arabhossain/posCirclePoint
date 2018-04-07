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
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
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
                        AppVars.XmappRootFolderURL=(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("xamppRoot").item(0).getTextContent()));
			AppVars.setJDBC_DRIVER(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("JDBC_DRIVER").item(0).getTextContent()));
			AppVars.setDB_Url(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("DB_URL").item(0).getTextContent()));
			AppVars.setDbName(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("DB_Name").item(0).getTextContent()));
			AppVars.setDbUser(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("DB_User").item(0).getTextContent()));
                        AppVars.setDbPass(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("DB_Password").item(0).getTextContent()));
		}
            }
            
            nList = doc.getElementsByTagName("Branch");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);		
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        AppVars.setShopName(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("Shop_Name").item(0).getTextContent()));
                        AppVars.setBranchID(Integer.parseInt(Arab.Arab3SH.De_Code(eElement.getElementsByTagName("BranchId").item(0).getTextContent())));
                    }
            }
            return true;
        }catch(Exception e){
            Notify.exceptionMessage(e);
            return false;
        }
    }
    public boolean editLocalXML(){
        if(delete_privious()){
             try {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("Local_Database");
		doc.appendChild(rootElement);

		// staff elements
		Element staff = doc.createElement("Driver");
		rootElement.appendChild(staff);
		Attr attr = doc.createAttribute("Connection");
		attr.setValue(AppVars.getDRIVER_Type());
		staff.setAttributeNode(attr);
                    Element xamppRoot = doc.createElement("xamppRoot");
                    xamppRoot.appendChild(doc.createTextNode(Arab.Arab3SH.En_Code(AppVars.XmappRootFolderURL)));
                    staff.appendChild(xamppRoot);
                    Element driveer = doc.createElement("JDBC_DRIVER");
                    driveer.appendChild(doc.createTextNode(Arab.Arab3SH.En_Code(AppVars.getJDBC_DRIVER())));
                    staff.appendChild(driveer);
                    Element dburl = doc.createElement("DB_URL");
                    dburl.appendChild(doc.createTextNode(Arab.Arab3SH.En_Code(AppVars.getDB_Url())));
                    staff.appendChild(dburl);
                    Element dbname = doc.createElement("DB_Name");
                    dbname.appendChild(doc.createTextNode(Arab.Arab3SH.En_Code(AppVars.getDbName())));
                    staff.appendChild(dbname);
                    Element user = doc.createElement("DB_User");
                    user.appendChild(doc.createTextNode(Arab.Arab3SH.En_Code(AppVars.getDbUser())));
                    staff.appendChild(user);
                    Element pass = doc.createElement("DB_Password");
                    pass.appendChild(doc.createTextNode(Arab.Arab3SH.En_Code(AppVars.getDbPass())));
                    staff.appendChild(pass);
                
                // staff elements
		Element a = doc.createElement("Branch");
		rootElement.appendChild(a);
		Attr b = doc.createAttribute("Area");
		b.setValue("Local");
		a.setAttributeNode(b);
                    Element c = doc.createElement("Shop_Name");
                    c.appendChild(doc.createTextNode(Arab.Arab3SH.En_Code(AppVars.getShopName())));
                    a.appendChild(c);
                    Element d = doc.createElement("BranchId");
                    d.appendChild(doc.createTextNode(Arab.Arab3SH.En_Code(String.valueOf(AppVars.getBranchID()))));
                    a.appendChild(d);
                   

		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("./Configs/Localconfig.xml"));

		// Output to console for testing
		// StreamResult result = new StreamResult(System.out);

		transformer.transform(source, result);

		Notify.console("Configuration xml file has updated successfully");
                return true;

	  } catch (ParserConfigurationException | TransformerException pce) {
              Notify.exceptionMessage(pce);
              return false;
	  }
        }else return false;
    }
    private boolean delete_privious(){
        try{
            new Delete("./Configs/Localconfig.xml");
       }catch(Exception e){
           Notify.exceptionMessage(e);
           return false;
       }
        return true;
    }
}
