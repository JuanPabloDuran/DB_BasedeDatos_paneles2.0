/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Zeo ft. Juan Pablo Durán
 */
public class ModelDetalleContacto {
    private String nombre;
    private String email;
    private String tel;

    public String getTel() {
        System.out.println(tel);
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNombre() {
        System.out.println(nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        System.out.println(email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
