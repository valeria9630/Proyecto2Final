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
public class Otros extends Catalogo {

    public Otros() {
    }

    public Otros(String titulo, String fechaIngreso, Autor autor) {
        super(titulo, fechaIngreso, autor);
    }

    public Otros(String titulo, String fechaIngreso, Autor autor, int codigoCatalogo) {
        super(titulo, fechaIngreso, autor, codigoCatalogo);
    }

    @Override
    public String toString() {
        return "Otros{" + '}';
    }
    
   
    public String mostrar6() {
        return "Titulon:"+getTitulo()+"\n"+"FechaIngreso:"+getFechaIngreso()+"\n"+"Autor:"+getAutor().getNombreUnico();
    }
}
