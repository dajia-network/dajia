package utils;

public class VendorUtils {
    public static final String domain = "api.vdian.com";
    public static final String api_path = "http://api.vdian.com/api";
    public static final String appkey = "642537";
    public static final String secret = "71a748a0c72eb8626eecacf340477846";
    public static final String token = "2bb4b461f2c8152d6aca91bd548c919f00033359a2";
    
    public static String generatePath4AllProducts (){
        String path = api_path + 
        "?param={%22page_num%22:1,%22page_size%22:50,%22orderby%22:1}" + 
        "&public={%22method%22:%22vdian.item.list.get%22,%22access_token%22:%22" + 
        token + "%22,%22version%22:%221.0%22,%22format%22:%22json%22}";
        return path;
    }
}