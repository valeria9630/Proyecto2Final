/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

/**
 *
 * @author daniela
 */
public abstract class Persona {

    private String nombreUnico;
    private String contraseña;
    private String nombreCompleto;
    private String tipoIdentificacion;
    private String identificacion;
    

    public Persona() {
        this.nombreUnico = "";
        this.contraseña = "";
        this.nombreCompleto = "";
        this.tipoIdentificacion = "";
        this.identificacion = "";
    }

    public Persona(String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        this.nombreUnico = nombreUnico;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
    }

    public String getNombreUnico() {
        return nombreUnico;
    }

    public void setNombreUnico(String nombreUnico) {
        this.nombreUnico = nombreUnico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUnico=" + nombreUnico + ", contrase\u00f1a=" + contraseña + ", nombreCompleto=" + nombreCompleto + ", tipoIdentificacion=" + tipoIdentificacion + ", identificacion=" + identificacion + '}';
    }

}
