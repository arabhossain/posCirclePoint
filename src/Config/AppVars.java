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

    /**
     *
     * @return
     */
    public static String getShopName() {
        return ShopName;
    }

    /**
     *
     * @param ShopName
     */
    public static void setShopName(String ShopName) {
        AppVars.ShopName = ShopName;
    }

    /**
     *
     * @return
     */
    public static int getBranchID() {
        return BranchID;
    }

    /**
     *
     * @param BranchID
     */
    public static void setBranchID(int BranchID) {
        AppVars.BranchID = BranchID;
    }

    /**
     *
     * @return
     */
    public static String getMoneySymble() {
        return MoneySymble;
    }

    /**
     *
     * @param MoneySymble
     */
    public static void setMoneySymble(String MoneySymble) {
        AppVars.MoneySymble = MoneySymble;
    }

    
    //Getter Setter for Local Database Variables
    
    /**
     *
     * @return
     */
    public static String getDRIVER_Type() {
        return DRIVER_Type;
    }

    /**
     *
     * @param DRIVER_Type
     */
    public static void setDRIVER_Type(String DRIVER_Type) {
        AppVars.DRIVER_Type = DRIVER_Type;
    }
     
    /**
     *
     * @return
     */
    public static String getJDBC_DRIVER() {
        return JDBC_DRIVER;
    }

    /**
     *
     * @param JDBC_DRIVER
     */
    public static void setJDBC_DRIVER(String JDBC_DRIVER) {
        AppVars.JDBC_DRIVER = JDBC_DRIVER;
    }

    /**
     *
     * @return
     */
    public static String getDB_Url() {
        return DB_Url;
    }

    /**
     *
     * @param DB_Url
     */
    public static void setDB_Url(String DB_Url) {
        AppVars.DB_Url = DB_Url;
    } 
    
    /**
     *
     * @return
     */
    public static String getDbName() {
        return DbName;
    }

    /**
     *
     * @param DbName
     */
    public static void setDbName(String DbName) {
        AppVars.DbName = DbName;
    }

    /**
     *
     * @return
     */
    public static String getDbUser() {
        return DbUser;
    }

    /**
     *
     * @param DbUser
     */
    public static void setDbUser(String DbUser) {
        AppVars.DbUser = DbUser;
    }

    /**
     *
     * @return
     */
    public static String getDbPass() {
        return DbPass;
    }

    /**
     *
     * @param DbPass
     */
    public static void setDbPass(String DbPass) {
        AppVars.DbPass = DbPass;
    }
 
    //Getter Setter for Cloud Vairables

    /**
     *
     * @return
     */
     public static String getCloudIP() {
        return CloudIP;
    }

    /**
     *
     * @param CloudIP
     */
    public static void setCloudIP(String CloudIP) {
        AppVars.CloudIP = CloudIP;
    }

    /**
     *
     * @return
     */
    public static String getCloudPort() {
        return CloudPort;
    }

    /**
     *
     * @param CloudPort
     */
    public static void setCloudPort(String CloudPort) {
        AppVars.CloudPort = CloudPort;
    }

    /**
     *
     * @return
     */
    public static String getCloudDatabaseName() {
        return CloudDatabaseName;
    }

    /**
     *
     * @param CloudDatabaseName
     */
    public static void setCloudDatabaseName(String CloudDatabaseName) {
        AppVars.CloudDatabaseName = CloudDatabaseName;
    }

    /**
     *
     * @return
     */
    public static String getCloudUser() {
        return CloudUser;
    }

    /**
     *
     * @param CloudUser
     */
    public static void setCloudUser(String CloudUser) {
        AppVars.CloudUser = CloudUser;
    }

    /**
     *
     * @return
     */
    public static String getCloudPass() {
        return CloudPass;
    }

    /**
     *
     * @param CloudPass
     */
    public static void setCloudPass(String CloudPass) {
        AppVars.CloudPass = CloudPass;
    }

    /**
     *
     */
    public final static javafx.scene.image.Image noImage=ImageLoad.img_dir("nophoto.png");
    //File IO Service packages variables
    private static String Content;
    private static String fileName;
    private static String DIR_URL="./Data/";

    /**
     *
     * @return
     */
    public static String getDIR_URL() {
        return DIR_URL;
    }

    /**
     *
     * @param DIR_URL
     */
    public static void setDIR_URL(String DIR_URL) {
        AppVars.DIR_URL = DIR_URL;
    }

    /**
     *
     * @return
     */
    public static String getContent() {
        return Content;
    }

    /**
     *
     * @param Content
     */
    public static void setContent(String Content) {
        AppVars.Content = Content;
    }

    /**
     *
     * @return
     */
    public static String getFileName() {
        return fileName;
    }

    /**
     *
     * @param fileName
     */
    public static void setFileName(String fileName) {
        AppVars.fileName = fileName;
    }
}
