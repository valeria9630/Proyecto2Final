/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

import java.util.ArrayList;

/**
 *
 * @author daniela
 */
public class Autor extends Persona {

    public Autor() {
    }

    public Autor(String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificacion);
    }
     @Override
    public String toString() {
        return getNombreUnico();
    }
}
