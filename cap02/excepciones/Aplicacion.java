/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.excepciones;
import java.util.ResourceBundle;
/**
 *
 * @author eduar
 */
public class Aplicacion 
{
    public Usuario login(String usrname, String password)throws ErrorFisicoException
    {
        try
        {
            ResourceBundle rb = ResourceBundle.getBundle("usuario");
            String usr = rb.getString("usrname");
            String pwd = rb.getString("password");
            Usuario u = null;
            if( usr.equals(usrname) && pwd.equals(password) )
            {
                u = new Usuario();
                u.setUsrname(usr);
                u.setPassword(pwd);
                u.setNombre( rb.getString("nombre") );
                u.setEmail(rb.getString("email") );
            }
            return u;
        }
        catch(Exception ex)
        {
            throw new ErrorFisicoException(ex);
        }
    }
}
