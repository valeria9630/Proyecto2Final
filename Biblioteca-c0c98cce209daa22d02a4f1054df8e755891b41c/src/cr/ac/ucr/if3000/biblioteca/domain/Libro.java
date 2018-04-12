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
public class Libro extends Catalogo {

    private String isbn;
    private String tema;
    private String subtema;

    public Libro() {
        this.isbn = isbn;
        this.tema = tema;
        this.subtema = subtema;
    }

    public Libro(String isbn, String tema, String subtema) {
        this.isbn = isbn;
        this.tema = tema;
        this.subtema = subtema;
    }

    public Libro(String isbn, String tema, String subtema, String titulo, String fechaIngreso, Autor autor) {
        super(titulo, fechaIngreso, autor);
        this.isbn = isbn;
        this.tema = tema;
        this.subtema = subtema;
    }

    public Libro(String isbn, String tema, String subtema, String titulo, String fechaIngreso, Autor autor, int codigoCatalogo) {
        super(titulo, fechaIngreso, autor, codigoCatalogo);
        this.isbn = isbn;
        this.tema = tema;
        this.subtema = subtema;
    }

   

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getSubtema() {
        return subtema;
    }

    public void setSubtema(String subtema) {
        this.subtema = subtema;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", tema=" + tema + ", subtema=" + subtema + '}';
    }
  
    public String mostrar1() {
        return "Titulon:"+getTitulo()+"\n"+"FechaIngreso:"+getFechaIngreso()+"\n"+"Autor:"+getAutor().getNombreUnico()+"\n"+
                "ISBN:"+getIsbn()+"\n"+"Tema:"+getTema()+"\n"+"SubTema:"+getSubtema();
    }

}
