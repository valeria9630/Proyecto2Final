/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Tesis extends Catalogo {

    private String resumen;
    private String abstracion;

    public Tesis() {
        this.resumen = resumen;
        this.abstracion = abstracion;
    }

    public Tesis(String resumen, String abstracion, String titulo, String fechaIngreso, Autor autor) {
        super(titulo, fechaIngreso, autor);
        this.resumen = resumen;
        this.abstracion = abstracion;
    }

    public Tesis(String resumen, String abstracion, String titulo, String fechaIngreso, Autor autor, int codigoCatalogo) {
        super(titulo, fechaIngreso, autor, codigoCatalogo);
        this.resumen = resumen;
        this.abstracion = abstracion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getAbstracion() {
        return abstracion;
    }

    public void setAbstracion(String abstracion) {
        this.abstracion = abstracion;
    }

    @Override
    public String toString() {
        return "Tesis{" + "resumen=" + resumen + ", abstracion=" + abstracion + '}';
    }

    public String mostrar4() {
        return  "Titulon:"+getTitulo()+"\n"+"FechaIngreso:"+getFechaIngreso()+"\n"+"Autor:"+getAutor().getNombreUnico()+"\n"+
                "Resumen:"+getResumen()+"\n"+"Abstract:"+getAbstracion();
    }
}
