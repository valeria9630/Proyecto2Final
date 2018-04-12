/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

import java.util.logging.Logger;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Memoria extends Catalogo{
    
    private String resumen;
    private String abstracto;
    private String nombreConferencia;

    public Memoria() {
        this.resumen = resumen;
        this.abstracto = abstracto;
        this.nombreConferencia = nombreConferencia;
    }

    public Memoria(String resumen, String abstracto, String nombreConferencia, String titulo, String fechaIngreso, Autor autor) {
        super(titulo, fechaIngreso, autor);
        this.resumen = resumen;
        this.abstracto = abstracto;
        this.nombreConferencia = nombreConferencia;
    }

    public Memoria(String resumen, String abstracto, String nombreConferencia, String titulo, String fechaIngreso, Autor autor, int codigoCatalogo) {
        super(titulo, fechaIngreso, autor, codigoCatalogo);
        this.resumen = resumen;
        this.abstracto = abstracto;
        this.nombreConferencia = nombreConferencia;
    }
    
    

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getAbstracto() {
        return abstracto;
    }

    public void setAbstracto(String abstracto) {
        this.abstracto = abstracto;
    }

    public String getNombreConferencia() {
        return nombreConferencia;
    }

    public void setNombreConferencia(String nombreConferencia) {
        this.nombreConferencia = nombreConferencia;
    }

    @Override
    public String toString() {
        return "Memoria{" + "resumen=" + resumen + ", abstracto=" + abstracto + ", nombreConferencia=" + nombreConferencia + '}';
    }
  
    
    public String mostrar5() {
        return "Titulon:"+getTitulo()+"\n"+"FechaIngreso:"+getFechaIngreso()+"\n"+"Autor:"+getAutor().getNombreUnico()+"\n"+
                "Resumen:"+getResumen()+"\n"+"Abstract:"+getAbstracto()+"\n"+"Nombre de Conferencia:"+getNombreConferencia();
    }
    
    
}
