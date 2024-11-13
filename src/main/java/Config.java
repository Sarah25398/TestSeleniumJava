import java.util.ResourceBundle;

public class Config{
    public static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("Config");
    public static String getURL(){
        return RESOURCE_BUNDLE.getString("url");
    }
    public static String getUserName(){
        return RESOURCE_BUNDLE.getString("username");
    }
    public static String getPassWord(){
        return RESOURCE_BUNDLE.getString("password");
    }


}

