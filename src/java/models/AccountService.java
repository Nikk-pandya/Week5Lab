
package models;


import java.io.Serializable;

/**
 *
 * @author 829364
 */
public class AccountService implements Serializable{
    
    private String password;
   private String username;
    

    public AccountService() {
         password = "";
        username = "";
      

    }

    public AccountService(String username, String password) {
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
