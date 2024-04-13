/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Validar;

/**
 *
 * @author Javi
 */

import javax.swing.JOptionPane;

public class Validar {
    public Validar(){}

    public boolean validacionCampo(String usuario, String password){
        return !usuario.isEmpty() && !password.isEmpty();
    }

    public boolean validacionUsuario(String usuario){
        return usuario.contains("@") && usuario.contains(".");
    }

    public boolean validarInicioSesion(String usuario, String password){
        if(validacionCampo(usuario, password) && validacionUsuario(usuario)){
            return usuario.equals("alumno@ulp.edu.ar") && password.equals("12345678");
        }
        return false;
    }
}
