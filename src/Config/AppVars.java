/*
 * Developer: Arab Hossain
 * Email: green.arab1995@gmail.com
 */
package Config;

/**
 *
 * @author emonh
 */
public class AppVars {
    public final static String APP_VERSION="v1.01";
   //Local Database Controlar variables 
     private static String DRIVER_Type;
     private static String JDBC_DRIVER;
     private static String DB_Url;
     private static String DbName;
     private static String DbUser;
     private static String DbPass;

   

    //Online Database Controller Variable
    private static String CloudIP;
    private static String CloudPort;
    private static String CloudDatabaseName;
    private static String CloudUser;
    private static String CloudPass;
    
    //Get Shop Information
    private static String ShopName;
    private static int BranchID;
    private static String MoneySymble;
    public static String XmappRootFolderURL;
    
//    public final static javafx.scene.image.Image noImage=ImageLoad.img_dir("nophoto.png");
    //File IO Service packages variables
    private static String Content;
    private static String fileName;
    private static String DIR_URL="./Data/";


    public static String getShopName() {
        return ShopName;
    }

    public static void setShopName(String ShopName) {
        AppVars.ShopName = ShopName;
    }

    public static int getBranchID() {
        return BranchID;
    }

    public static void setBranchID(int BranchID) {
        AppVars.BranchID = BranchID;
    }
    public static String getMoneySymble() {
        return MoneySymble;
    }
    public static void setMoneySymble(String MoneySymble) {
        AppVars.MoneySymble = MoneySymble;
    }

    //Getter Setter for Local Database Variables
    public static String getDRIVER_Type() {
        return DRIVER_Type;
    }
    public static void setDRIVER_Type(String DRIVER_Type) {
        AppVars.DRIVER_Type = DRIVER_Type;
    }
    public static String getJDBC_DRIVER() {
        return JDBC_DRIVER;
    }
    public static void setJDBC_DRIVER(String JDBC_DRIVER) {
        AppVars.JDBC_DRIVER = JDBC_DRIVER;
    }
    public static String getDB_Url() {
        return DB_Url;
    }
    public static void setDB_Url(String DB_Url) {
        AppVars.DB_Url = DB_Url;
    } 
    public static String getDbName() {
        return DbName;
    }
    public static void setDbName(String DbName) {
        AppVars.DbName = DbName;
    }
    public static String getDbUser() {
        return DbUser;
    }
    public static void setDbUser(String DbUser) {
        AppVars.DbUser = DbUser;
    }
    public static String getDbPass() {
        return DbPass;
    }
    public static void setDbPass(String DbPass) {
        AppVars.DbPass = DbPass;
    }
 
    //Getter Setter for Cloud Vairables
     public static String getCloudIP() {
        return CloudIP;
    }

    public static void setCloudIP(String CloudIP) {
        AppVars.CloudIP = CloudIP;
    }

    public static String getCloudPort() {
        return CloudPort;
    }

    public static void setCloudPort(String CloudPort) {
        AppVars.CloudPort = CloudPort;
    }

    public static String getCloudDatabaseName() {
        return CloudDatabaseName;
    }

    public static void setCloudDatabaseName(String CloudDatabaseName) {
        AppVars.CloudDatabaseName = CloudDatabaseName;
    }

    public static String getCloudUser() {
        return CloudUser;
    }

    public static void setCloudUser(String CloudUser) {
        AppVars.CloudUser = CloudUser;
    }

    public static String getCloudPass() {
        return CloudPass;
    }

    public static void setCloudPass(String CloudPass) {
        AppVars.CloudPass = CloudPass;
    }

    public static String getDIR_URL() {
        return DIR_URL;
    }

    public static void setDIR_URL(String DIR_URL) {
        AppVars.DIR_URL = DIR_URL;
    }

    public static String getContent() {
        return Content;
    }

    public static void setContent(String Content) {
        AppVars.Content = Content;
    }

    public static String getFileName() {
        return fileName;
    }
    public static void setFileName(String fileName) {
        AppVars.fileName = fileName;
    }
}
