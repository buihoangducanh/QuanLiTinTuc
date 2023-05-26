package quanlitintuc.dataContext;

/**
 *
 * @author AnhBui
 */
public class CurrentUser {
    
    public static String username;
    public static String fullName;
    public static boolean isAdmin;

    public static void setLoggedInUser(String username, String fullName, boolean isAdmin) {
        CurrentUser.username = username;
        CurrentUser.fullName = fullName;
        CurrentUser.isAdmin = isAdmin;
    }

    public static void reset() {
        username = null;
        fullName = null;
        isAdmin = false;
        
    }
    
    
}
