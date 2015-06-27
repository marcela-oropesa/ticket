/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Administradores;
import Entidades.Tecnicos;
import Entidades.Usuarios;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Marce
 */
public class LoginNeg {
    
    Session session;
    
    public static int ADMINISTRADOR = 1;
    public static int USUARIO = 2;
    public static int TECNICO = 3;
    
    public LoginNeg(){
         session = NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public boolean autenticar(String rut, String pass, int tipo){
        if(tipo==ADMINISTRADOR){
            Query query = session.createQuery("from Administradores where rut_administrador='"+rut+"' and password='"+pass+"'");
            List<Administradores> resp = query.list();
            return !resp.isEmpty();
        }else if(tipo==USUARIO){
            Query query = session.createQuery("from Usuarios where rut_usuario='"+rut+"' and password='"+pass+"'");
            List<Usuarios> resp = query.list();
            return !resp.isEmpty();
        }else if(tipo==TECNICO){
            Query query = session.createQuery("from Tecnicos where rut_tecnico='"+rut+"' and password='"+pass+"'");
            List<Tecnicos> resp = query.list();
            return !resp.isEmpty();
        }return false;
    }
}
