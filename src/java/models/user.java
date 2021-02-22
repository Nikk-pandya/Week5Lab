
package models;

/**
 *
 * @author 829364
 */
public class user {
    
    
    String password;
    String username;

    public user() {
    }

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    
}
