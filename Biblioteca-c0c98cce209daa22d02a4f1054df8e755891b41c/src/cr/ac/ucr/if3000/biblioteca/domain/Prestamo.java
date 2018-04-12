/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

import java.util.Date;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Prestamo {

    private int numeroPrestamo;
    private Persona persona;
    private String fechaInicioPrestamo;
    private String fechaDevoluciónInicial;

    public Prestamo() {
        numeroPrestamo = 0;

    }

    public Prestamo(int numeroPrestamo, Persona persona, String fechaInicioPrestamo, String fechaDevoluciónInicial) {
        this.numeroPrestamo = numeroPrestamo;
        this.persona = persona;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaDevoluciónInicial = fechaDevoluciónInicial;
    }

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getFechaInicioPrestamo() {
        return fechaInicioPrestamo;
    }

    public void setFechaInicioPrestamo(String fechaInicioPrestamo) {
        this.fechaInicioPrestamo = fechaInicioPrestamo;
    }

    public String getFechaDevoluciónInicial() {
        return fechaDevoluciónInicial;
    }

    public void setFechaDevoluciónInicial(String fechaDevoluciónInicial) {
        this.fechaDevoluciónInicial = fechaDevoluciónInicial;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "numeroPrestamo=" + numeroPrestamo + ", persona=" + persona + ", fechaInicioPrestamo=" + fechaInicioPrestamo + ", fechaDevoluci\u00f3nInicial=" + fechaDevoluciónInicial + '}';
    }

}
