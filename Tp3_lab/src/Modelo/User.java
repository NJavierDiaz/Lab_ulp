/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Javi
 */
public class User {
    private String mail;
    private String contraseña;
    
    public User(){}
    
    public User(String mail, String contraseña){
        this.mail = mail;
        this.contraseña = contraseña;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "mail=" + mail + ", contrase\u00f1a=" + contraseña + '}';
    }
}
