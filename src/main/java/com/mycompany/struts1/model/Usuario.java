/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.struts1.model;

/**
 *
 * @author FLHORIAN
 */
public class Usuario {
    private String Nombre;
    private String apePaterno;
    private String apeMaterno;
    private String fecNac;
    private String lugarRes;
    private String edad;
    private String telefono;
    private String correo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    public String getLugarRes() {
        return lugarRes;
    }

    public void setLugarRes(String lugarRes) {
        this.lugarRes = lugarRes;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String toString() {
        return "Nombre: " + getNombre() + "apePaterno: " + getApePaterno() + "apeMaterno: " + getApeMaterno()
                + "fecNac: " + getFecNac() + "lugarRes: " + getLugarRes() + "edad: " + getEdad() + "telefono: " + getTelefono()
                + "correo: " + getCorreo();
    }
}
