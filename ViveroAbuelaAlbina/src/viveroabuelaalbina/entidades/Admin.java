
package viveroabuelaalbina.entidades;


public class Admin extends Persona {
    private int admin_id;
    private String user;
    private String password;

    public Admin() {
    }

    public Admin(int admin_id, String user, String password) {
        this.admin_id = admin_id;
        this.user = user;
        this.password = password;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
