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
public class Periodico extends Catalogo{
    private String issb;
    private String edicion;
    private String fecha;

    public Periodico() {
        this.issb = issb;
        this.edicion = edicion;
        this.fecha = fecha;
    }

    public Periodico(String issb, String edicion, String fecha, String titulo, String fechaIngreso, Autor autor) {
        super(titulo, fechaIngreso, autor);
        this.issb = issb;
        this.edicion = edicion;
        this.fecha = fecha;
    }

    public Periodico(String issb, String edicion, String fecha, String titulo, String fechaIngreso, Autor autor, int codigoCatalogo) {
        super(titulo, fechaIngreso, autor, codigoCatalogo);
        this.issb = issb;
        this.edicion = edicion;
        this.fecha = fecha;
    }
    
    public String getIssb() {
        return issb;
    }

    public void setIssb(String issb) {
        this.issb = issb;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Periodico{" + "issb=" + issb + ", edicion=" + edicion + ", fecha=" + fecha + '}';
    }
    
    public String mostrar3() {
        return "Titulon:"+getTitulo()+"\n"+"FechaIngreso:"+getFechaIngreso()+"\n"+"Autor:"+getAutor().getNombreUnico()+"\n"+
                "ISSB:"+getIssb()+"\n"+"Edicion:"+getEdicion()+"\n"+"Fecha:"+getFecha();
    }
    
    
}
