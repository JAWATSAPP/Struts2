/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.struts1.registros.action;

import com.mycompany.struts1.model.Usuario;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author FLHORIAN
 */
public class Registros extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Usuario usuarioBean;

    public String execute() throws Exception {
        //call Service class to store personBean's state in database

        return SUCCESS;
    }

    public Usuario getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(Usuario usuario) {
        usuarioBean = usuario;
    }

    public void validate() {
        if (usuarioBean.getNombre().length() == 0) {
            addFieldError("usuarioBean.getNombre", "Name is required.");
        }

        if (usuarioBean.getApePaterno().length() == 0) {
            addFieldError("usuarioBean.getApePaterno", "Apellido Paterno is required.");
        }
        if (usuarioBean.getApeMaterno().length() == 0) {
            addFieldError("usuarioBean.getApeMaterno", "Apellido Materno is required.");
        }
        if (usuarioBean.getFecNac().length() == 0) {
            addFieldError("usuarioBean.getFecNac", "Fecha de Nacimiento is required.");
        }
        if (usuarioBean.getLugarRes().length() == 0) {
            addFieldError("usuarioBean.getLugarRes", "Residencia is required.");
        }
        if (usuarioBean.getEdad().length() == 0) {
            addFieldError("usuarioBean.getEdad", "Edad is required.");
        }
        if (usuarioBean.getTelefono().length() == 0) {
            addFieldError("usuarioBean.getTelefono", "Telefono is required.");
        }
        if (usuarioBean.getCorreo().length() == 0) {
            addFieldError("usuarioBean.getCorreo", "correo is required.");
        }

    }

}
