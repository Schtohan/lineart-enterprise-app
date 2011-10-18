/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import se.linjekoll.authentication.Authentication;

/**
 *
 * @author Schtohan
 */
@ManagedBean(name = "authenticationBean")
@RequestScoped
public class authenticationBean {
    
    @EJB
    Authentication a = new Authentication();

    /** Creates a new instance of authenticationBean */
    public authenticationBean() {
    }
    
    public void setPassword(String password) {
        a.setPassword(password);
    }

    public void setUserName(String userName) {
        a.setUserName(userName);
    }

    public void setPassword2(String password2) {
        a.setPassword2(password2);
    }
    
    public String createPerson(){
        return a.createPerson();       
    }
}
