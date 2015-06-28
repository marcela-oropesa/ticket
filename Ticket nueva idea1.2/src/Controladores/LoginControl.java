/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Negocio.LoginNeg;
import Vistas.Login;
import Vistas.MantenedorAdministradores;
import Vistas.MantenedorTecnicos;
import Vistas.MantenedorUsuarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Marce
 */
public class LoginControl {
    
    private Login  login; //vista
    
    public LoginControl(Login login){
        this.login = login; //guardando la vista
    }
    
    public void ingresar(String rut, String pass, String tipo){
        LoginNeg loginNeg = new LoginNeg();
        int tipoInt=0;
        switch (tipo) {
            case "Usuario":
                tipoInt = LoginNeg.USUARIO;
                break;
            case "Técnico":
                tipoInt = LoginNeg.TECNICO;
                break;
            case "Administrador":
                tipoInt = LoginNeg.ADMINISTRADOR;
                break;
        }
        if(loginNeg.autenticar(rut, pass, tipoInt)){ //Si autentica abre la ventana que corresponde
            if(tipoInt==LoginNeg.ADMINISTRADOR){
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new MantenedorAdministradores().setVisible(true);
                    }
                });
            }else if(tipoInt==LoginNeg.TECNICO){
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new MantenedorTecnicos().setVisible(true);
                    }
                });
            }else if(tipoInt==LoginNeg.USUARIO){
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new MantenedorUsuarios().setVisible(true);
                    }
                });
            }
            login.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "El rut o password no son válidos.");
        }
    }
    
}
