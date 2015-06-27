package Entidades;
// Generated 26-06-2015 22:31:49 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private String rutUsuario;
     private Empresas empresas;
     private String nombres;
     private String apellidos;
     private String cargo;
     private String telefonoMovil;
     private String mail;
     private String estado;
     private String password;
     private Set tickets = new HashSet(0);

    public Usuarios() {
    }

	
    public Usuarios(String rutUsuario, Empresas empresas) {
        this.rutUsuario = rutUsuario;
        this.empresas = empresas;
    }
    public Usuarios(String rutUsuario, Empresas empresas, String nombres, String apellidos, String cargo, String telefonoMovil, String mail, String estado, String password, Set tickets) {
       this.rutUsuario = rutUsuario;
       this.empresas = empresas;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.cargo = cargo;
       this.telefonoMovil = telefonoMovil;
       this.mail = mail;
       this.estado = estado;
       this.password = password;
       this.tickets = tickets;
    }
   
    public String getRutUsuario() {
        return this.rutUsuario;
    }
    
    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }
    public Empresas getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getTelefonoMovil() {
        return this.telefonoMovil;
    }
    
    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getTickets() {
        return this.tickets;
    }
    
    public void setTickets(Set tickets) {
        this.tickets = tickets;
    }




}

