package Entidades;
// Generated 26-06-2015 22:31:49 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empresas generated by hbm2java
 */
public class Empresas  implements java.io.Serializable {


     private String rutEmpresa;
     private String nombre;
     private String fantasia;
     private String giro;
     private String direccion;
     private String telefono;
     private String empresascol;
     private String password;
     private Set usuarioses = new HashSet(0);

    public Empresas() {
    }

	
    public Empresas(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }
    public Empresas(String rutEmpresa, String nombre, String fantasia, String giro, String direccion, String telefono, String empresascol, String password, Set usuarioses) {
       this.rutEmpresa = rutEmpresa;
       this.nombre = nombre;
       this.fantasia = fantasia;
       this.giro = giro;
       this.direccion = direccion;
       this.telefono = telefono;
       this.empresascol = empresascol;
       this.password = password;
       this.usuarioses = usuarioses;
    }
   
    public String getRutEmpresa() {
        return this.rutEmpresa;
    }
    
    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFantasia() {
        return this.fantasia;
    }
    
    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }
    public String getGiro() {
        return this.giro;
    }
    
    public void setGiro(String giro) {
        this.giro = giro;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmpresascol() {
        return this.empresascol;
    }
    
    public void setEmpresascol(String empresascol) {
        this.empresascol = empresascol;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }




}

